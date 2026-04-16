select empno, ename, deptno, dname
from emp natural join dept order by ename;

select empno, ename, sal, dname
from emp natural join dept where sal >= 2000
order by sal desc; 

select empno, ename, job,sal, dname 
from dept natural join emp where job = 'manager' and sal > 2500
order by empno;

select empno, ename, sal, grade
from emp join salgrade on emp.sal between salgrade.LOSAL and salgrade.HISAL
where grade = 4 order by sal desc;

select empno, ename, dname, sal, grade
from emp natural join dept
join salgrade on emp.sal between salgrade.LOSAL and salgrade.HISAL
order by grade desc;

select e.ename, m.ename
from emp e join emp m
on e.mgr = m.empno;

select e.ename, m.ename, s.ename
from emp e join emp m on e.mgr = m.empno
join emp s on m.mgr = s.EMPNO;

select e.ename, m.ename, s.ename
from emp e left join emp m on e.mgr = m.empno
left join emp s on m.mgr = s.EMPNO;

select ename, dname, deptno
from emp natural join dept
where deptno = 20;

select ename, comm, dname
from emp join dept using(deptno)
where comm is not null AND comm != 0;

select ename, dname
from emp join dept using(deptno)
where instr(ename, 'A') != 0;

select ename, sal, hiredate, loc
from emp join dept using(deptno) 
where loc = 'dallas' and sal >= 1500;

select e.ename as '사원', m.ename as '관리자', e.sal
from emp e join emp m on e.mgr = m.empno
where e.sal > m.sal;

select dname, count(*)
from emp join dept using(deptno) 
where hiredate < '1982-01-01'
group by(dname);

select ename, sal, hiredate, dname, DATEDIFF(CURDATE(), hiredate) / 365 as '근무년수'
from emp natural join dept
where TIMESTAMPDIFF(YEAR, hiredate, CURDATE()) < 40;