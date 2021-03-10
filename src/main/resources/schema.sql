-- DB 생성
create database car_rental_system;

-- 테이블 생성
create table car_rental_system.user (user_id int(5) primary key, user_name varchar(10));
create table car_rental_system.admin (admin_id int(5) primary key, admin_name varchar(10));
create table car_rental_system.car (car_id int(5) primary key, car_name varchar(10), company varchar(10));
create table car_rental_system.rental_info (id int(5) primary key, user_id int(5), car_id int(5));