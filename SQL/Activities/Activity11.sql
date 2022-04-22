--Write a query that produces the name and number of each salesman and each customer with more than one current order. Put the results in alphabetical order.

select customer_id,customer_name from customers a where(select count(*) from orders b where a.customer_id= b.customer_id)>1
UNION
Select salesman_id , salesman_name from salesman a where(select count(*) from orders b where a.salesman_id =b.salesman_id)>1 order by customer_name;

--Write a query to make a report of which salesman produce the largest and smallest orders on each date. Also add a column that shows "highest on" and "lowest on" values.

SELECT a.salesman_id, name, order_no, 'highest on', order_date FROM salesman a, orders b
WHERE a.salesman_id=b.salesman_id
AND b.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date = b.order_date)
UNION
SELECT a.salesman_id, name, order_no, 'lowest on', order_date FROM salesman a, orders b
WHERE a.salesman_id=b.salesman_id
AND b.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = b.order_date);