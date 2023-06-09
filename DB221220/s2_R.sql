-- 데이터 조회

-- 모두 조회
SELECT * FROM DEC20_SNACK;

-- 이름, 가격만
SELECT S_NAME, S_PRICE FROM DEC20_SNACK;

-- 이름, 유통기한만
select s_name, s_exp AS EXP_DATE from dec20_snack;

-- 이름, 가격, 부가세(가격의 10%)
SELECT S_NAME, S_PRICE, S_PRICE * 0.1 AS VAT FROM DEC20_SNACK;

-- 이름, 가격, g당 가격
SELECT S_NAME, S_PRICE, S_PRICE/S_WEIGHT FROM DEC20_SNACK;

-- 평균가
SELECT avg(S_PRICE) FROM DEC20_SNACK;

-- 총 과자 개수, g당 가격의 평균
SELECT COUNT(*), AVG(S_PRICE/S_WEIGHT) FROM DEC20_SNACK;

-- 이름, 유통기한, 가격이 3000원 이하
SELECT S_NAME, S_EXP, S_PRICE FROM DEC20_SNACK WHERE S_PRICE<=3000;

-- 새우깡의 가격
SELECT S_PRICE FROM DEC20_SNACK WHERE S_NAME = '새우깡';

-- 1000원 미만인 제품의 개수
SELECT COUNT(*) FROM DEC20_SNACK WHERE S_PRICE < 1000;

-- '초코'시리즈 이름, 가격 / 문자열 포함 검색
SELECT S_NAME, S_PRICE FROM DEC20_SNACK WHERE S_NAME LIKE '%초코%';

-- 내일 먹으면 죽는 과자 이름, 유통기한, 가격
SELECT S_NAME, S_EXP, S_PRICE FROM DEC20_SNACK WHERE S_EXP <= SYSDATE;

-- 유통기한이 오늘 오후 8시까지인 과자 데이터 추가 
INSERT INTO DEC20_SNACK VALUES (DEC20_SNACK_SEQ.NEXTVAL, '빅파이', TO_DATE('20221220 20:00', 'YYYYMMDD HH24:MI'), 700.12, 3500);

-- 유통기한이 오늘 오후 23시 59분 59초까지 인 과자이름, 유통기한, 가격
SELECT S_NAME, S_EXP, S_PRICE FROM DEC20_SNACK WHERE S_EXP <= TO_DATE(CONCAT(TO_CHAR(SYSDATE, 'YYYYMMDD'), '235959'), 'YYYYMMDDHH24MISS');

-- '깡'시리즈거나, 가격이 2000원 이상인 과자 이름, 가격
SELECT S_NAME, S_PRICE FROM DEC20_SNACK WHERE (S_NAME LIKE '%깡') OR (S_PRICE >= 2000);

-- 1000 < 가격 < 3000원인 과자 이름, 유통기한, 가격
SELECT S_NAME, S_EXP, S_PRICE FROM DEC20_SNACK WHERE (S_PRICE > 1000) AND (S_PRICE < 3000);


-- 유통기한이 오늘아침 9시부터 오늘 저녁 9시인 범위내 과자 이름, 유통기한, 가격
SELECT S_NAME, S_EXP, S_PRICE FROM DEC20_SNACK 
WHERE S_EXP >= TO_DATE(CONCAT(TO_CHAR(SYSDATE, 'YYYY-MM-DD'), ' 09:00:00'), 'YYYY-MM-DD HH24:MI:SS')
AND S_EXP <= TO_DATE(CONCAT(TO_CHAR(SYSDATE, 'YYYY-MM-DD'), ' 21:00:00'), 'YYYY-MM-DD HH24:MI:SS') ;

-- 최고가
SELECT MAX(S_PRICE) FROM DEC20_SNACK;

-- 최고가 과자의 이름, 가격 / 서브쿼리
SELECT S_NAME, S_PRICE FROM DEC20_SNACK WHERE S_PRICE = (SELECT MAX(S_PRICE) FROM DEC20_SNACK);

-- 평균보다 싼 과자의 이름, 가격
SELECT S_NAME, S_PRICE FROM DEC20_SNACK WHERE S_PRICE < (SELECT avg(S_PRICE) FROM DEC20_SNACK);

-- 유통기한 제일 길게 남은 과자의 이름, 유통기한, 가격
SELECT S_NAME, S_EXP, S_PRICE FROM DEC20_SNACK WHERE S_EXP = (SELECT MAX(S_EXP) FROM DEC20_SNACK);



