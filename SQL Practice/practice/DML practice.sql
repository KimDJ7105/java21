show variables like 'autocommit%';
set autocommit=false; 
-- 자동 커밋 설정 확인 후 비활성화 

insert into dept (deptno, dname, loc)
values (41, '인사과', '서울');
-- 명시적 insert
-- commit 하지 않으면 실제로 적용되지 않는다. 

insert into dept (deptno, dname)
values (42, '영업과');
-- 컬럼을 생략할 수 있다. 이 경우 생략된 컬럼은 null이 된다. 

insert into dept
values (43,'운송과', '잠실');
-- 컬럼명을 명시하지 않고도 insert 가능하다.
-- 이때는 테이블의 컬럼 순서에 맞춰 데이터가 저장된다. 

insert into dept
values (43,'운송과');
-- 컬럼을 명시하지 않았을 때는 컬럼에 맞춰 모든 데이터를 넣어줘야 한다. 

select * from dept;
-- commit을 하지 않은 경우
-- 검색 결과에 보이나, 실제 db에 반영된 것이 아니다. 
-- 재실행 후 다시 시행하면 추가한 레코드가 없다! 

create table my_emp
as
select empno, ename, sal from emp where 1=2;
-- emp 테이블의 empno, ename, sal 컬럼을 복사해서
-- 새로운 테이블 생성, where 절은 레코드는 복사하지 않겠다는 뜻

insert into my_emp (empno, ename, sal)
select empno, ename, sal from emp;
-- 서브 쿼리를 활용해서 my_emp 테이블에 다중행 생성 

insert into my_emp (empno, ename, sal)
values (10, '홍동길',500), (20, '임꺽정', 300), (77, '임정꺽', 400);
-- value list로 my_emp 테이블에 다중행 생성
commit;

update my_emp
set ename='이순신', sal=1000;
-- 모든 컬럼의 데이터를 변경
rollback;
-- 취소

update my_emp
set ename='임꺽정', sal=100 where empno < 100;
-- 조건에 맞는 레코드들 수정
rollback;

delete from my_emp;
rollback;
-- 모든 레코드 삭제 후 취소

delete from my_emp where empno < 100;
rollback;
-- 조건에 맞는 레코드만 삭제 후 취소 

select * from my_emp;
drop table my_emp;
-- 테이블 삭제 