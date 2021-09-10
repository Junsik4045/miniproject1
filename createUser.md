Mysql 접속 방법

1. cmd
2. workbanch
3. apmsetup



mysql -u root -p

root 비밀번호 입력



use mysql;

create user 'springuser'@'localhost' identified by 'springpass';

create database springdata character set=utf8;

grant all privileges on springdata.* to 'springuser'@'localhost';

flush privileges;



mysql -u springuser -p

sprintpass

use springdata;

[MiniProject.sql 참조]