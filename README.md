# jpa-associations

SQL statements for creating the data base tables:

create database jpa_associations;

Tables for one-to-many associations:

create table customer(
	id int primary key auto_increment,
    name varchar(30)
);

create table phoneNumber(
	id int primary key auto_increment,
    customer_id int not null,
    number varchar(10) not null,
    foreign key (customer_id) references customer(id) 
);
