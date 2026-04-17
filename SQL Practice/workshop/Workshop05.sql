create table if not exists tb_category (
	name varchar(10),
    use_yn char(1) default'Y' check(use_yn in ('y', 'n'))
);

create table if not exists tb_class_type (
	no varchar(5) primary key,
    name varchar(10)
);

alter table tb_category
add constraint primary key(name);

alter table tb_class_type 
modify name varchar(10) not null;

alter table tb_category 
modify name varchar(20);
alter table tb_class_type 
modify name varchar(20),
modify no varchar(10);

drop table tb_category, tb_class_type;