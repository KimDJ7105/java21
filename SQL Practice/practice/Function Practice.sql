SELECT empno, lower(ename), upper(ename), upper('hello') from emp;
-- 문자열 함수 (대문자/소문자)

SELECT empno, concat(ename,'  ',sal) from emp;
SELECT empno, concat_ws(', ',ename,sal) from emp;
-- 문자열 연결 

SELECT empno, lpad(ename, 10, '*'), rpad(ename, 10, '*') from emp;
-- 문자열 채우기 

select empno, ename, substr(ename, 3, 2) from emp;
select empno, ename, substr(ename, 3) from emp;
select empno, ename, left(ename, 3), right(ename, 3) from emp;
-- 문자열 부분열 

select ename, length(ename), length('홍길동') from emp;
-- byte 크기를 알려주는 length 함수
select ename, char_length(ename), char_length('홍길동') from emp;
-- 문자열의 길이를 알려주는 char_length 함수 

select ename, sal, replace(sal, '0', 'o') from emp;
-- 문자열 치환 (0을 o로 치환)
select ename, insert(ename, 2,3, '44') from emp;
-- 문자열 치환 ename의 2번 위치부터 3글자를 44로 치환

select ename, instr(ename, 'nes') from emp;
-- ename에서 nes 부분열을 찾아서 위치를 출력 

select ename, ltrim('   hello    '), rtrim('   hello    '),trim('   hello    ') from emp;
-- 공백 제거 ltrim rtrim trim 

select trim(leading 'x' from 'xxxxhelloxxxx'),
	trim(trailing 'x' from 'xxxxhelloxxxx'),
    trim(both 'x' from 'xxxxhelloxxxx') from emp;
-- 특정 문자 제거 x를 앞 뒤 양옆 제거. 

select ename, repeat(ename, 2) from emp;
-- 문자열 반복. ename을 2번 반복 

select ename, reverse(ename) from emp;
-- 거꾸로 출력, ename을 거꾸로

select ename, reverse(repeat(ename, 2)) from emp;
-- 반복 문자열을 거꾸로 출력 (중첩 활용)

select concat(ename,space(5),sal) from emp;
-- 공백 만들기 ename과 sal 사이에 5칸 공백을 추가 

select format(1254.2165, 0),format(1254.2165, 2),format(1234567895.2, 2) from emp;
-- 숫자를 포멧을 가진 문자열로 출력 

-- ///////////////////////////////////////////

SELECT ABS(2), ABS(-32);
-- 절대값 반환 

SELECT sign(-32), sign(0), sign(115);
-- 부호 반환 -1, 0 , 1

SELECT round(1234.5678), round(1234.5678, 2);
-- 반올림. 

SELECT truncate(1234.5678,1), truncate(1234.5678, 3);
-- 내림. 

SELECT ceil(10.456), floor(10.456);
SELECT ceil(-10.456), floor(-10.456);
-- 실수를 정수로 변환. ceil은 주어진 실수보다 큰 정수 floor는 작은 정수 

SELECT mod(10,2), mod(9991,5);

-- /////////////////////////////
SELECT now(), now() + 0, current_timestamp(), sysdate();
SELECT NOW(), SLEEP(2), NOW();
SELECT SYSDATE(), SLEEP(2), SYSDATE();
-- 현재 날자 및 시간 출력
select curdate(), current_date;
-- 날짜만 출력
SELECT curtime(), current_time();
-- 시간만 출력 
SELECT now(), adddate(now(), 25), curtime(), addtime(curtime(), 11);
select date_add('2008-01-02', interval 31 day);
select date_add('2008-01-02', interval 31 month);
select date_add('2008-01-02', interval 31 year);
-- 날짜와 시간 더하기
SELECT now(), subdate(now(), 15), curtime(), subtime(curtime(), 12);
select date_sub('2008-01-02', interval 31 day);
select date_sub('2008-01-02', interval 31 month);
select date_sub('2008-01-02', interval 31 year);
-- 날짜와 시간 빼기 
select datediff('2008-01-02', curdate());
select datediff(curdate(), '2008-01-02');
select timestampdiff(MONTH, '2008-01-02', curdate());
select timestampdiff(YEAR, '2008-01-02', curdate());
select timestampdiff(DAY, '2008-01-02', curdate());
select timestampdiff(HOUR, '2008-01-02', curdate());
-- 두 날짜 사이에 빼기
select last_day(curdate()), last_day('2029-02-05');
-- 달의 마지막 날 출력 
select extract(year from now());
select extract(year_month from now());
select extract(day_hour from now());
-- 날짜에서 원하는 요소만 추출 
select date_format(now(), '%y%m%d');
select date_format(now(), '%Y-%M-%d. %h:%i:%S');
-- 날짜를 원하는 포멧의 문자열로 변환
select str_to_date('2015-11-25', '%Y-%m-%d');
select str_to_date('18012009', '%d%m%Y');
select str_to_date('2000년12월25일', '%Y년%m월%d일');
select str_to_date('20260415143755', '%Y%m%d%H%i%S');
-- 문자열을 날짜로 변환 

-- ///////////////////////////
select if(1>2, 2, 3);
select empno, ename, if(sal > 3000, '과장이상', '일반사원') from emp;
-- 조건 분기문
SELECT empno, ename, CASE job WHEN 'clerk' then sal * 1.1 when 'salesman' then sal * 1.2 when 'manager' then sal *1.3 when 'analyst' then sal * 1.4 else sal end as '실수령' from emp;
-- 다중 동등 비교 
SELECT empno, ename, sal, CASE WHEN sal >= 3000 then 'A' when sal >= 2000 then 'B' when sal >= 1000 then 'C' else 'D' end as '등급' from emp;
-- 다중 부등 비교 
SELECT CAST(sal as char), CAST('8475.125' as float8), CAST(154 as double) from emp;
SELECT CAST('2010-02-23' as date);
-- 형 변환 숫자를 문자열로, 문자열을 실수로. 정수를 실수로 