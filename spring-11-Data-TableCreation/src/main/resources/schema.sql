
--Dropping Tab;e if it already exists in dB
DROP TABLE IF EXISTS employees;

--Creating Employees' Table
CREATE TABLE EMPLOYEES(
    id int not null ,
    name varchar(25),
    primary key (id)
);

