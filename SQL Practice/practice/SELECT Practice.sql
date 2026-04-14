USE testdb;
SELECT * FROM dept;
-- dept 테이블의 모든 컬럼

select * from emp;
-- emp 테이블의 모든 컬럼

SELECT empno FROM emp;
-- emp 테이블의 empno 컬럼
SELECT empno as EmployNumber FROM emp;
-- emp 테이블의 empno를 EmployNumber라는 헤더로
SELECT empno, ename, job FROM emp;
-- emp 테이블의 empno,ename,job 컬럼
SELECT sal, sal * 1.1 FROM emp;
-- emp 테이블의 sal과 sal에 1.1을 곱한 값
SELECT sal, round(sal * 1.1) FROM emp;
-- emp 테이블의 sal과 sal * 1.1의 반올림

SELECT sal, '리터럴', empno FROM emp;
-- emp 테이블의 sal, empno 컬럼과 리터럴 컬럼

SELECT comm, comm+100 FROM emp;
-- null은 연산해도 null이 된다. 

SELECT (sal*12)+ifnull(comm, 0) as '연봉', 
	(sal*12)+comm as '연봉(기본값X)' FROM emp;
-- 연봉을 계산, 이때 comm이 null이면 결과도 null이 된다.
-- 따라서 null을 임의의 기본값으로 변경 필요
-- ifnull(컬럼, 기본값) 

-- distinct 중복제거
SELECT distinct job FROM emp;
-- emp 테이블의 job 컬럼을 중복 제거해서 select
-- 조건문을 사용해 결과 가져오기.
SELECT * from emp where sal = 3000;
SELECT * from emp where sal >= 3000;
SELECT * from emp where hiredate > '1980-12-17';
-- 날짜 데이터도 내부적으로 숫자로 관리됨으로 비교 가능. 
SELECT * from emp where sal BETWEEN 1000 AND 2000;
SELECT * from emp where hiredate BETWEEN '1980-12-17' AND '1981-12-17';
-- 범위로 지정해서 탐색 (between A and B)
SELECT * from emp where sal IN(1000,2000,800);
-- 여러 값중 하나에 해당되는 레코드들을 탐색 IN(값1, 값2, 값3, ...)
SELECT * from emp where comm IS NULL;
SELECT * from emp where comm IS NOT NULL;
-- emp 테이블에서 conn 컬럼이 null인 / null이 아닌 레코드 찾기

SELECT * FROM emp WHERE ename LIKE '%A%';
-- 이름에 A 가 들어가는 레코드 검색 (A 앞 또는 뒤에 여러개의 문자가 있거나 없거나)
SELECT * FROM emp WHERE ename LIKE 'A%';
-- 이름이 A로 시작하는 레코드
SELECT * FROM emp WHERE ename LIKE '%A';
-- 이름이 A로 끝나는 레코드
SELECT * FROM emp WHERE ename LIKE '_A';
-- 이름이 두 글자고 A 앞에 문자가 하나 오는 이름
SELECT * FROM emp WHERE ename LIKE '_A%';
-- A가 두 번째 글자인 이름을 가진 레코드

SELECT * FROM emp WHERE ename LIKE '%B%' AND sal > 1000;
-- 이름에 B가 들어가고 월급이 1000이 넘는 레코드 
SELECT * FROM emp WHERE sal > 800 OR comm > 200;
-- 월급이 800이 넘거나 혹은 커미션이 200보다 큰 레코드
SELECT * FROM emp WHERE sal NOT BETWEEN 1000 AND 2000;
-- 월급이 1000과 2000 사이가 아닌 레코드 

SELECT * FROM emp order by sal;
-- sal을 기준으로 오름차순 정렬
SELECT * FROM emp order by sal desc;
-- sal을 기준으로 내림차순 정렬 
SELECT * FROM emp order by sal, deptno;
-- sal을 기준으로 오름차순 정렬 후 sal이 같은 레코드는 deptno 기준으로 정렬
SELECT * FROM emp order by sal desc, deptno;
-- sal 이 내림차순이어도 deptno로 정렬은 오름차순
SELECT empno, ename, sal as salary FROM emp order by salary;
-- 별칭으로도 정렬 컬럼 선택 가능 
SELECT empno, ename, sal FROM emp order by 3;
-- SELECT에 지정된 순서로도 정렬 컬럼 선택 가능