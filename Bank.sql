drop database BankDB;
create database BankDB;
use BankDB;
create table Customers(
customers_id int primary key not null,
customers_name varchar(100)
);

create table CorporateCustomer(
customers_id int,
id int primary key auto_increment,
companyName varchar(255) not null,
taxNumber varchar(12) not null,
email varchar(100) not null unique,
password varchar(100) not null,
CONSTRAINT CommercialCustomer_ibfk_01 foreign key(customers_id) references Customers(customers_id)
);

create table IndividualCustomer(
customers_id int,
id int primary key auto_increment,
userName varchar(150) not null,
firstName varchar(200) not null,
lastName varchar(200) not null,
email varchar(250) not null unique,
password varchar(250) not null,
TC varchar(11) not null unique,
birthYear varchar(4) not null,
CONSTRAINT PrivateCustomer_ibfk_01 foreign key(customers_id) references Customers(customers_id)
);

create table Staffs(
staffs_id int primary key not null,
authority int not null,
staffs_name varchar(100) not null
);

create table manager(
id int primary key auto_increment,
staffs_id int not null,
FirstName varchar(255) not null,
LastName varchar(255) not null,
TC varchar(11) not null,
BirthYear int not null,
email varchar(250) not null unique,
password varchar(250) not null,
CONSTRAINT manager_ibfk_01 foreign key (staffs_id) references Staffs(staffs_id)
);

create table asisstant_director(
id int primary key auto_increment,
staffs_id int not null,
FirstName varchar(255) not null,
LastName varchar(255) not null,
TC varchar(11) not null,
BirthYear int not null,
email varchar(250) not null unique,
password varchar(250) not null,
CONSTRAINT assistans_director_ibfk_01 foreign key (staffs_id) references Staffs(staffs_id)
);

create table employee(
id int primary key auto_increment,
staffs_id int not null,
FirstName varchar(255) not null,
LastName varchar(255) not null,
TC varchar(11) not null,
BirthYear int not null,
email varchar(250) not null unique,
password varchar(250) not null,
CONSTRAINT employee_director_ibfk_01 foreign key (staffs_id) references Staffs(staffs_id)
);

create table Accounts(
account_id int primary key,
account_name varchar(255)
);

create table currency (
currency_id int primary key,
currency_name varchar(100) unique,
currency_nationality varchar(150),
added_at datetime
);

create table maturityTLAccount(
id int primary key auto_increment,
account_id int,
customers_type_id int,
customer_id int,
card_type_id int,
currency_id int,
card_id int,
account_name varchar(255),
balance decimal check(balance >= 0 and balance <=1000),

CONSTRAINT maturityTLAccount_ibfk_01 foreign key (account_id)references Accounts(account_id),
CONSTRAINT maturityTLAccount_ibfk_02 foreign key (customers_type_id)references Customers(customers_id),
CONSTRAINT maturityTLAccount_ibfk_03 foreign key (currency_id)references currency(currency_id)
);	

create table unmaturityTLAccount(
id int primary key auto_increment,
account_id int,
customers_type_id int,
customer_id int,
card_type_id int,
card_id int,
currency_id int,
account_name varchar(255),
balance decimal check(balance >= 0 and balance <=1000),

CONSTRAINT unmaturityTLAccount_ibfk_01 foreign key (account_id)references Accounts(account_id),
CONSTRAINT unmaturityTLAccount_ibfk_02 foreign key (customers_type_id)references Customers(customers_id),
CONSTRAINT unmaturityTLAccount_ibfk_03 foreign key (currency_id)references currency(currency_id)
);	

create table appeals(
appeal_type_id int primary key,
appeal_name varchar(255)
);

create table credit_card_appeal(
appeal_id int,
customers_type_id int,
customers_id int,
situation varchar(255),
added_at datetime,

CONSTRAINT credit_card_appeal_ibfk_01 foreign key(appeal_id)references appeals(appeal_type_id),
CONSTRAINT credit_card_appeal_ibfk_02 foreign key (customers_type_id)references Customers(customers_id)
);

create table money_card_appeal(
appeal_id int,
customers_type_id int,
customers_id int,
situation varchar(255),
added_at datetime,

CONSTRAINT money_card_appeal_ibfk_01 foreign key(appeal_id)references appeals(appeal_type_id),
CONSTRAINT money_card_appeal_ibfk_02 foreign key (customers_type_id)references Customers(customers_id)
);

create table veritification(
veritification_id int primary key,
veritification_name varchar(255)
);














