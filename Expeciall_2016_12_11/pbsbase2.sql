drop database if exists pbsbase2;
create database pbsbase2;
use pbsbase2;

create table student_table
(
    student_id int auto_increment primary key,
    name varchar(16) not null,
    telnum varchar(16) not null,
    gender varchar(16) default 'UNKNOWN',
    remark varchar(64),
    unique(telnum),
    unique (name)
);

insert into student_table values(null, "huangss0", "00000000000", "man", "a boy");
insert into student_table values(null, "huangss1", "00000000001", "man", "a boy");