-- Create the database
CREATE DATABASE Employee;

-- Use the created database
USE Employee;

-- Create the employees table
CREATE TABLE employees (
                           fullname VARCHAR(255) NOT NULL,
                           username VARCHAR(100) NOT NULL UNIQUE,
                           phone_number VARCHAR(20) NOT NULL UNIQUE,
                           password VARCHAR(255) NOT NULL
);
