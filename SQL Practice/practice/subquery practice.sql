-- smith 보다 sal을 더 많이 받는 사원 정보 출력하기
-- 기존 방법
select sal from emp where ename = 'smith'; -- 800
select empno, ename, sal from emp where sal > 800;

-- 위 두 쿼리를 한 번에 수행할 수 없을까?
-- subquery 사용. 
select empno, ename, sal
from emp
where sal > (select sal from emp where ename = 'smith');

select empno, ename, job, hiredate, sal from emp
where job = (select job from emp where empno = 7521)
AND sal > (select sal from emp where empno = '7934');
-- 서브쿼리는 여러번 사용 가능하다. 

SELECT *
FROM emp
WHERE sal < (SELECT AVG(sal) FROM emp);
-- 평균과 같은 값도 서브 쿼리를 사용해야 한다. 

-- 20번 부서의 최저 급여보다 많은 최저 급여를 가진 부서 출력 
SELECT dname, min(sal)
FROM emp natural join dept
GROUP BY dname
HAVING min(sal) > (SELECT min(sal) FROM emp WHERE deptno = 20);

-- 업무별로 최소 급여를 받는 사원 정보
select empno, ename, job, hiredate, sal, deptno
from emp
where sal IN (select min(sal) from emp group by job);

-- 매니저 직무의 최소 급여보다 적게 받는 직원 정보
select empno, ename, job, sal
from emp
where sal < ALL (select sal from emp where job = 'manager');
-- 서브 쿼리 결과 manager 직원들의 급여 테이블이 리턴됨
-- 급여 테이블의 모든 데이터보다 작은 경우를 검색 결과로 지정. 

select empno, ename, job, hiredate, sal, deptno
from emp
where sal IN (select min(sal) from emp group by job);

-- 매니저 직무의 최대 급여보다 적게 받는 직원
select empno, ename, job, sal
from emp
where sal < ANY (select sal from emp where job = 'manager');
-- 서브 쿼리의 결과 테이블 중 어느 하나라도 더 큰게 있는 경우

select *
from emp
where exists (select ename from emp where sal = 500);
-- exists 는 서브 쿼리 결과가 있는 경우에만 메인 쿼리가 실행된다. 

-- emp와 dept 테이블에서 부서별 sal 총합과 평균 출력 
SELECT e.deptno, total_sum, total_avg, cnt
FROM ( SELECT deptno, SUM(sal) total_sum, ROUND(AVG(sal)) total_avg,
COUNT(*) cnt
FROM emp
GROUP BY deptno) e JOIN dept d ON e.deptno = d.deptno; 