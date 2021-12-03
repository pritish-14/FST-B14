REM   Script: Activity 7
REM   Activity 7

select SUM(purchase_amount) AS "Total_sum" from orders;

SELECT AVG(purchase_amount) AS "Average" FROM orders;

SELECT MAX(purchase_amount) AS "Maximum" FROM orders;

SELECT MIN(purchase_amount) AS "Minumum" FROM orders;

SELECT COUNT(DISTINCT salesman_id) AS "Total count" FROM orders;

