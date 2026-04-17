create table student( 
	studno int PRIMARY KEY,
	stuname varchar(10) );

create table if not exists subject(
	subno int primary key,
    subname varchar(20) not null,
    term varchar(1) check(term in ('1', '2')),
    type varchar(4)
);

create table if not exists sugang (
	studno int,
	subno int,
	regdate date,
	result int,
	primary key (studno, subno),
	foreign key (studno) references student(studno),
	foreign key (subno) references subject(subno)
);

drop table sugang;
drop table subject;
drop table student;