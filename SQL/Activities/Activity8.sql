--Write an SQL statement to find the highest purchase amount ordered by the each customer with their ID and highest purchase amount

select customer_id ,MAX(Purchase_amount) as "MAX AMOUNT" FROM ORDERS GROUP BY CUSTOMER_ID;

--Write an SQL statement to find the highest purchase amount on '2012-08-17' for each salesman with their ID.
select salesman_id, order_date, max(purchase_amount) AS "Max amount" from orders where order_date=TO_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id, order_date;

-- Write an SQL statement to find the highest purchase amount with their ID and order date, for only those customers who have a higher purchase amount within the list 2030, 3450, 5760, 
--and 6000.
select customer_id, order_date, max(purchase_amount) AS "max amount" from orders GROUP BY customer_id, order_date HAVING MAX(PURCHASE_AMOUNT) IN(2030,3450,5760,6000);