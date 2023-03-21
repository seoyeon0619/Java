select * from DEC19_STUDENT;

create table dec20_coffee (
c_name varchar2(10 char), 
c_price number(5)
);

insert into dec20_coffee values ('아메리카노', 3000);
insert into dec20_coffee values ('카페라떼', 3500);

INSERT INTO DEC20_COFFEE(C_NAME, C_PRICE) 
VALUES ('카페모카', 4000);

INSERT INTO DEC20_COFFEE(C_PRICE, C_NAME) VALUES (5000, '녹차라떼');
INSERT INTO DEC20_COFFEE2(C_NAME) VALUES ('고구마라떼');

select * from dec20_coffee;

create table dec20_coffee2 (
c_name varchar2(10 char) PRIMARY KEY, 
c_price number(5) NOT NULL
);

INSERT INTO DEC20_COFFEE2 VALUES ('아메리카노', 3000);
INSERT INTO DEC20_COFFEE2 VALUES ('카페라떼', 3500);
INSERT INTO DEC20_COFFEE2 VALUES ('녹차라떼', 4000);
INSERT INTO DEC20_COFFEE2 VALUES ('딸기라떼', 4500);
INSERT INTO DEC20_COFFEE2 VALUES ('키위주스', 4500);

SELECT * FROM DEC20_COFFEE2;

CREATE TABLE DEC20_STUDENT (
S_NO NUMBER(4) PRIMARY KEY,
S_NAME VARCHAR2(5 CHAR) NOT NULL,
S_KOR NUMBER(3) NOT NULL,
S_ENG NUMBER(3) NOT NULL,
S_MATH NUMBER(3) NOT NULL
);

INSERT INTO DEC20_STUDENT VALUES (1, '홍길동', 100, 90, 97);
INSERT INTO DEC20_STUDENT VALUES (2, '김길동', 95, 78, 85);
INSERT INTO DEC20_STUDENT VALUES (3, '이길동', 85, 50, 64);
INSERT INTO DEC20_STUDENT VALUES (4, '최길동', 96, 71, 68);

DROP table DEC20_STUDENT CASCADE CONSTRAINT PURGE;


-- 시퀀스 생성
CREATE SEQUENCE DEC20_STUDENT_SEQ;

CREATE TABLE DEC20_STUDENT (
S_NO NUMBER(4) PRIMARY KEY,
S_NAME VARCHAR2(5 CHAR) NOT NULL,
S_KOR NUMBER(3) NOT NULL,
S_ENG NUMBER(3) NOT NULL,
S_MATH NUMBER(3) NOT NULL
);

-- 시퀀스 사용
INSERT INTO DEC20_STUDENT VALUES (DEC20_STUDENT_SEQ.NEXTVAL, '홍길동', 100, 90, 97);
INSERT INTO DEC20_STUDENT VALUES (DEC20_STUDENT_SEQ.NEXTVAL, '김길동', 95, 78, 85);
INSERT INTO DEC20_STUDENT VALUES (DEC20_STUDENT_SEQ.NEXTVAL, '이길동', 85, 50, 64);
INSERT INTO DEC20_STUDENT VALUES (DEC20_STUDENT_SEQ.NEXTVAL, '최길동', 96, 71, 68);
INSERT INTO DEC20_STUDENT VALUES (DEC20_STUDENT_SEQ.NEXTVAL, '박길동', 66, 80, 20);

SELECT * FROM DEC20_STUDENT;

------------------------------------------------------------------------------------------

CREATE TABLE DEC20_SNACK(
S_NO NUMBER(3) PRIMARY KEY,
S_NAME VARCHAR2(10 CHAR) NOT NULL,
S_EXP DATE NOT NULL,
S_WEIGHT NUMBER(5, 2) NOT NULL,
S_PRICE NUMBER(5) NOT NULL
);

CREATE SEQUENCE DEC20_SNACK_SEQ;

INSERT INTO DEC20_SNACK VALUES(DEC20_SNACK_SEQ.NEXTVAL, '새우깡', SYSDATE, 200.12, 3000);
INSERT INTO DEC20_SNACK VALUES(DEC20_SNACK_SEQ.NEXTVAL, '양파링', TO_DATE('20230301', 'YYYYMMDD'), 300.58, 3000);
INSERT INTO DEC20_SNACK VALUES(DEC20_SNACK_SEQ.NEXTVAL, '꼬깔콘', TO_DATE('20230423', 'YYYYMMDD'), 425.20, 2800);
INSERT INTO DEC20_SNACK VALUES(DEC20_SNACK_SEQ.NEXTVAL, '칸쵸', TO_DATE('20231105', 'YYYYMMDD'), 385.98, 2700);
INSERT INTO DEC20_SNACK VALUES(DEC20_SNACK_SEQ.NEXTVAL, '포테이토칩', TO_DATE('20231208', 'YYYYMMDD'), 500.02, 2000);
INSERT INTO DEC20_SNACK VALUES(DEC20_SNACK_SEQ.NEXTVAL, '초코파이', TO_DATE('20230927', 'YYYYMMDD'), 789.14, 6000);
INSERT INTO DEC20_SNACK VALUES(DEC20_SNACK_SEQ.NEXTVAL, '후렌치파이', TO_DATE('20231010 15:00', 'YYYYMMDD HH24:MI'), 789.14, 6000);
INSERT INTO DEC20_SNACK VALUES(DEC20_SNACK_SEQ.NEXTVAL, '꿀과배기', TO_DATE('20231125 15:30:20', 'YYYYMMDD HH24:MI:SS'), 352.01, 2000);

SELECT * FROM DEC20_SNACK;
