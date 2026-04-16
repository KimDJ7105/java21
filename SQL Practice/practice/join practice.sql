select * from emp cross join dept;
-- cross join 

select * from emp natural join dept;
select empno, ename, sal, dname, deptno from emp natural join dept;
select emp.empno, emp.ename, emp.sal, dept.dname, dept.deptno 
from emp natural join dept;
select e.empno, e.ename, e.sal, d.dname, d.deptno 
from emp e natural join dept d;
-- 각 컬럼이 어느 테이블에 속하는지 명시적으로 작성 가능. 
-- 테이블에 별칭 지정 가능.
-- natural join 

select empno, ename, sal, dname, deptno 
from emp natural join dept
where deptno = 20 and sal > 2000;
-- 검색 조건도 적용 가능하다. 

select * from emp join dept using(deptno);
select * from emp inner join dept using(deptno);
select * from emp join dept using(deptno) where sal > 1500;
-- using 절을 사용한 join
-- 어떤 컬럼으로 연결할지 명시한다. 
-- 검색 조건도 당연하게 설정 가능. 이후 불가한 경우만 명시한다. 

select e.ename, e.sal, d.deptno, d.dname 
from emp e join dept d using(deptno);
-- 별칭도 사용 가능. 다만, using 절에서는 별칭 사용 불가. 

select * from emp join dept on emp.DEPTNO = dept.deptno;
select ename, sal, dname, loc, emp.deptno
from emp join dept on emp.DEPTNO = dept.deptno;
-- on 절을 사용한 join
-- 동일 컬럼을 select 하는 경우 어느 테이블의 컬럼인지 명시해야 한다. 

select ename, sal, grade from emp join salgrade on emp.sal between salgrade.LOSAL and salgrade.HISAL; 
select ename, sal, grade from emp e join salgrade s 
on e.sal between s.LOSAL and s.HISAL; 
-- on 절을 사용해서 non equi join도 가능하다.
-- on절에서는 별칭을 사용 가능하다. 

select ename, emp.deptno, dname, sal, grade 
from emp natural join dept 
join salgrade on emp.sal between salgrade.LOSAL and salgrade.HISAL; 
-- 3중 join. natural 조인과 on 절을 사용. 
-- natural, on, using 전부 사용 가능. 복합 사용 가능. 

select ename, emp.deptno, dname, sal, grade 
from emp join dept using(deptno)
join salgrade on emp.sal between salgrade.LOSAL and salgrade.HISAL; 
-- using과 on절을 사용한 3중 join의 예제 

select * from emp right outer join dept using(deptno);
select * from emp left outer join dept on emp.deptno = dept.deptno;
-- outer join right는 dept가 left는 emp가 
-- 일치되는 데이터가 없어도 출력된다. 

select e.ename as '사원명', m.ENAME as '상급자명' from emp e join emp m on e.mgr = m.empno;