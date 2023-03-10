CREATE DATABASE bms;
USE bms;

CREATE TABLE buyer(
	buyer_id VARCHAR(5) PRIMARY KEY,
	name VARCHAR(50) UNIQUE NOT NULL,
	address VARCHAR(100) NOT NULL,
	contact_no VARCHAR(15) UNIQUE NOT NULL,
	email VARCHAR(50) UNIQUE NOT NULL,
	gender VARCHAR(10) NOT NULL
);

CREATE TABLE product(
	product_id VARCHAR(5) PRIMARY KEY,
	product_name VARCHAR(50) UNIQUE NOT NULL,
	rate INT NOT NULL,
	description VARCHAR(100) ,
	active VARCHAR(3) NOT NULL
);