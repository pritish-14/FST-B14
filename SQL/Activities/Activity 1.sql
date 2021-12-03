REM   Script: Activity 1
REM   Activity 1

CREATE TABLE salesman;

CREATE TABLE salesman 
(salesman_id int, 
 salesman_name varchar2(20), 
 salesman_city varchar2(20), 
 commission int 
);

DESCRIBE salesman


drop table salesman;

CREATE TABLE salesman 
(salesman_id int not null, 
 salesman_name varchar2(20), 
 salesman_city varchar2(20), 
 commission int 
);

DESCRIBE salesman


