select job, sum(sal) from emp group by job;
select deptno, sum(sal) from emp group by deptno;
-- job 별로, deptno별로 sal의 합계를 구하기.

select job, sum(sal), avg(sal), max(sal), min(sal), count(sal) from emp group by job;
select deptno, sum(sal), avg(sal), max(sal), min(sal), count(sal) from emp group by DEPTNO;
-- job/deptno 별로 sal의 합계, 평균, 최대, 최소, 레코드의 개수 

 select deptno, sum(sal) from emp group by deptno having sum(sal) > 9000;
 -- 그룹에도 having 절을 통해서 조건을 줄 수 있다. 
 select deptno, sum(sal), avg(sal) from emp where sal > 1000 group by deptno having sum(sal) > 9000;
 -- where 절과 having 절의 동시 사용 예시
 select deptno, job, sum(sal), avg(sal), max(sal), min(sal), count(sal) from emp group by DEPTNO, job;
 -- select 에 컬럼을 지정할 때는 group by 로 묶여있는 컬럼만 가능하다.
 select sum(sal), avg(sal), count(sal) from emp;
 -- group by를 안해도 자동으로 전체 컬럼을 묶은 그룹을 형성해서 실행해준다. 
 select count(comm) from emp;
-- count 는 null인 레코드는 세어주지 않는다. 
select count(*) from emp;
-- count(*)을 사용해 전체 레코드 개수를 확인할 수 있다. 