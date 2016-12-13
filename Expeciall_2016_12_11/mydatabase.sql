drop database if exists mydatabase;
create database mydatabase;
use mydatabase;

create table student_table
(
	sno int primary key auto_increment,
	sname varchar(20) not null,
	telnum varchar(12) not null,
	sex varchar(6) not null,
	remark varchar(64)
);

insert into student_table values(null, "huangss1", "11111111110", "man", "boy");
insert into student_table values(null, "huangss2", "11111111111", "feman", "girl");
insert into student_table values(null, "huangss3", "11111111112", "man", "boy");
insert into student_table values(null, "huangss4", "11111111113", "feman", "girl");
insert into student_table values(null, "huangss5", "11111111114", "man", "boy");