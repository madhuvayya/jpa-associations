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

Tables for many-to-many associations:

	create table programmer(
		id int primary key auto_increment,
    	name varchar(30)
	);

	create table project(
		id int primary key auto_increment,
   		name varchar(30)
	);

	create table programmers_projects(
		programmer_id int not null,
    	project_id int not null,
    	foreign key (programmer_id) references programmer(id),
    	foreign key (project_id) references project(id)
	);
	
Tables for one-to-one associations:

	create table person(
		id int primary key auto_increment,
    	name varchar(20)
	);

	create table license(
		id int primary key auto_increment,
    	person_id int not null,
    	type varchar(20) not null,
		foreign key (person_id) references person(id)
	);
