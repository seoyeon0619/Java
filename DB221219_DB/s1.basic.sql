create table dec19_product2(s_name varchar2(1), s_price number);
select * from DEC19_PRODUCT2;

DROP table DEC19_PRODUCT CASCADE CONSTRAINT PURGE;
DROP table DEC19_PRODUCT2 CASCADE CONSTRAINT PURGE;