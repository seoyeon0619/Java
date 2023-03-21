-- 테이블 생성
create table dec19_student (
s_name varchar2(10 CHAR),
s_age NUMBER(3),
s_kor number(3),
s_eng number(3),
s_math number(3)
);

-- 데이터 삽입
insert into DEC19_STUDENT values('이서연', 23, 85, 78, 65);
insert into DEC19_STUDENT values('홍길동', 19, 100, 90, 97);

-- 데이터 조회
select * from DEC19_STUDENT;
select avg (s_kor + s_eng + s_math)/3 from DEC19_STUDENT;
