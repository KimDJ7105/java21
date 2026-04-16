select empno, ename, sal
from emp
where sal > (select sal from emp where ename = 'blake');

select empno, ename, hiredate
from emp where hiredate > (
select hiredate from emp where ename = 'miller');

select empno, ename, sal from emp
where sal > (select avg(sal) from emp);

select empno, ename, deptno, sal from emp
where sal IN (select max(sal) from emp group by deptno);

select * from emp 
where sal < (select avg(sal) from emp e join salgrade s
on e.sal between s.losal and s.hisal where grade = 2);