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