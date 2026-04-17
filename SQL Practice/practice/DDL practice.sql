create table IF NOT EXISTS board (
	num int primary KEY auto_increment,
    title varchar(100) NOT NULL,
    content varchar(500) NOT NULL,
    writeday datetime default now(),
    gender char(4) check( gender in('M','F'))
);
    -- 테이블을 생성. 컬럼레벨에서 제약조건 설정
drop table board;
-- 테이블 삭제 
    
 create table IF NOT EXISTS board2
(
	num int AUTO_INCREMENT,
	title varchar(100)   NOT NULL,
	author varchar(10),
	content varchar(500) NOT NULL,
	writeday datetime DEFAULT now(),
	gender char(4),
	readcnt int DEFAULT 0,
		
	CONSTRAINT PRIMARY KEY(num),
	CONSTRAINT UNIQUE(author),
	CONSTRAINT CHECK (gender in ('M','F'))
);
-- 테이블 생성. 테이블레벨에서 제약조건 설정. 
drop table board2;

create table master1(
	no int PRIMARY KEY,
	name varchar(10) NOT NULL);
-- master 테이블 생성 
insert into master1 ( no, name ) values (1, 'aa1' );
insert into master1 ( no, name ) values (2, 'aa2' );
insert into master1 ( no, name ) values (3, 'aa3' );
commit;
-- master 테이블에 레코드 추가. 

create table slave1(  
	num int PRIMARY KEY,
	ename VARCHAR(10) NOT NULL,
	no int,
      
	CONSTRAINT FOREIGN KEY(no) REFERENCES master1(no) ON DELETE CASCADE
);
-- slave 테이블 추가. master의 no컬럼을 참조하는 외래 키를 가진다.
-- 왜래키를 테이블레벨 제약조건으로 설정. 
-- NOT NULL은 테이블레벨로는 설정 불가능. 
insert into slave1 (num, ename, no ) values ( 10, 'slave1', 1 );
insert into slave1 (num, ename, no ) values ( 20, 'slave2', 2 );
insert into slave1 (num, ename, no ) values ( 30, 'slave3', 3 );   
insert into slave1 (num, ename, no ) values ( 50, 'slave5', null );
commit;
-- slave 테이블에 레코드 추가.
-- 왜래키는 null이 될 수 있다. 

drop table slave1;
-- master1 부터 삭제 불가능. slave1이 master1을 참조하므로. 
drop table master1;

create table IF NOT EXISTS tb_tmp (
	no int,
    name varchar(3),
    id int,
    sex varchar(1)
);
-- tmp 테이블 추가. 
alter table tb_tmp
add CONSTRAINT primary key(no),
add CONSTRAINT unique(id),
add CONSTRAINT check(sex in('남', '여')),
modify name varchar(3) not null;
-- 테이블을 만든 후에 제약조건 설정. 
-- NOT NULL 제한조건은 modify를 사용해야한다. 

insert into tb_tmp (no, name, id, sex) 
values (0, '홍길동', 0, '남'); 
insert into tb_tmp (no, name, id, sex) 
values (1, '유관순', 1, '여'); 
insert into tb_tmp (no, name, id, sex) 
values (2, '김김김', 0, '남');
-- 오류, id의 unique 제약조건을 위반. 
insert into tb_tmp (no, name, id, sex) 
values (3, '이이이', 3, 'male');
-- 오류, sex의 check 제약조건 위반. 
insert into tb_tmp (no, name, id, sex) 
values (4, null, 4, '남');   
-- 오류, name의 not null 제약조건 위반. 

drop table tb_tmp;
-- 테이블 삭제. 

create table IF NOT EXISTS tb_tmp (
	no int primary key, 
    name varchar(3) NOT NULL,
    id int UNIQUE,
    sex varchar(1) check(sex in ('남', '여'))
);
-- 테이블 생성
insert into tb_tmp (no, name, id, sex) 
values (0, '홍길동', 0, '남'); 
insert into tb_tmp (no, name, id, sex) 
values (1, '유관순', 1, '여'); 
insert into tb_tmp (no, name, id, sex) 
values (2, '이순신', 2, '남'); 
insert into tb_tmp (no, name, id, sex) 
values (3, '안유림', 3, '여');
insert into tb_tmp (no, name, id, sex) 
values (4, '안중근', 4, '남'); 
insert into tb_tmp (no, name, id, sex) 
values (5, '김구', 5, '남'); 
commit;
-- 레코드 삽입
delete from tb_tmp;
-- DML인 delete문으로 레코드 삭제
select * from tb_tmp;
rollback;
-- DML이므로 rollback 하면 삭제 취소. 

truncate tb_tmp;
-- DDL인 truncate로 레코드 삭제
rollback;
-- DDL 이므로 rollback 해도 취소 안됨. 

Create table if not exists my_dept (
	no int primary key,
	name varchar(10) 
);

alter table my_dept
add column address varchar(20);
-- 테이블 추가
alter table my_dept
modify address varchar(50);
-- 컬럼 수정 (크기를 키웠다.) 
alter table my_dept
rename column address to addr;
-- 컬럼 이름 변경 
alter table my_dept
drop name;
-- 컬럼 삭제 

select * from my_dept;