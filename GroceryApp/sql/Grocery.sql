create database day2;
use day2;
create table product(
items int primary key,
product_id int,
product_name varchar(30),
qty double,
price int,
totalprice double,
mobile_number varchar(20),
loaction varchar(10));
drop table product;
create table user(
username varchar(20),
password int);
drop table user;
select * from product;
select * from user;

