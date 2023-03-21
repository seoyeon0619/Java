create table bnsaabfp_member(
	m_id varchar2(10 char) primary key,
	m_pw varchar2(10 char) not null,
	m_name varchar2(10 char) not null,
	m_birthday date not null,
	m_addr varchar2(100 char) not null,
	m_photo varchar2(150 char) not null
);
-----------------------------------------------
create table bnsaabfp_sns(
	s_no number(5) primary key, 		-- �۹�ȣ
	s_owner varchar2(10 char) not null, -- �۾��� id
	s_txt varchar2(500 char) not null,  -- �۳���
	s_date date not null,				-- �۾���¥
	s_color char(7) not null,
	constraint sns_writer
		foreign key(s_owner) references bnsaabfp_member(m_id)
		on delete cascade
);
create sequence bnsaabfp_sns_seq;
-----------------------------------------------
create table bnsaabfp_sns_reply(
	sr_no number(6) primary key,		 -- ��۹�ȣ[seq]
	sr_owner varchar2(10 char) not null, -- ��۾��� id[session/input]
	sr_txt varchar2(150 char) not null,  -- ��۳���[input]
	sr_date date not null,				 -- ��۾���¥[sysdate]
	sr_s_no number(5) not null,			 -- �Ҽӱ۹�ȣ[input(readonly/hidden)]
	constraint sns_reply2
		foreign key(sr_s_no) references bnsaabfp_sns(s_no)
		on delete cascade
	--, constraint sns_reply_owner2
	--		foreign key(sr_owner) references bnsaabfp_member(m_id)
	--		on delete cascade
);
create sequence bnsaabfp_sns_reply_seq;

drop sequence bnsaabfp_sns_seq;
drop sequence bnsaabfp_sns_reply_seq;
drop table bnsaabfp_member cascade constraint purge;
drop table bnsaabfp_sns cascade constraint purge;
drop table bnsaabfp_sns_reply cascade constraint purge;

-- ��� ���� ���� �� ��ü�� �ȳ�����
-- �Խ��� ��翡�� �ȸ���[���� ���� ������]
select * 
from bnsaabfp_sns, bnsaabfp_sns_reply
where s_no = sr_s_no;

-- ��...
select *
from bnsaabfp_sns_reply
where sr_s_no = (

);

-- 58������ ��۵� �����ͼ�
-- ArrayList<���>

-- Ŭ���� �Խ���
select *
from bnsaabfp_sns_reply
where sr_s_no = 58;

-- constraint �������Ǹ�
--		foreign key(�ʵ��) references ���̺��(�ʵ��)
--		on delete cascade

select * 
from (
	select rownum as rn, m_photo, s_no, s_owner, s_date, s_txt, s_color
	from (
		select m_photo, s_no, s_owner, s_date, s_txt, s_color
		from bnsaabfp_member, bnsaabfp_sns
		where m_id = s_owner
		order by s_date desc
	)
)
where rn >= 3 and rn <= 5

select * 
from (
	select rownum as rn, m_photo, s_no, s_owner, s_date, s_txt, s_color
	from (
		select m_photo, s_no, s_owner, s_date, s_txt, s_color
		from bnsaabfp_member, bnsaabfp_sns
		where m_id = s_owner and s_txt like '%��%' or s_owner like '%��%'
		order by s_date desc
	)
)
where rn >= 3 and rn <= 5


-- 1. 
select * from bnsaabfp_member;
-- -> DAO���� �ݺ���+���ǹ�

-- 2.[����]
select * from bnsaabfp_member
where m_id='test' and m_pw='a1';
-- -> DAO������ �׳� ����ó��

-- 3. 
select * from bnsaabfp_member
where m_id='test';
-- -> DAO���� pw�˻�


select count(*)
from bnsaabfp_sns
where s_txt like '%��%' or s_owner like '%��%';

select * from bnsaabfp_sns_reply;









