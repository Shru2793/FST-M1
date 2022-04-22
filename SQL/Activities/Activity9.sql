--Write an SQL statement to know which salesman are working for which customer.
select a.customer_name, b.salesman_name from customers a INNER JOIN salesman b ON a.salesman_id= b.salesman_id;

-- Write an SQL statement to make a list in ascending order for the customer who holds a grade less than 300 and works either through a salesman
SELECT a.customer_name, a.grade, b.salesman_name FROM customers a LEFT JOIN salesman b ON a.salesman_id = b.salesman_id where a.grade < 300 ORDER BY a.customer_id;

-- Write an SQL statement to find the list of customers who appointed a salesman for their jobs who gets a commission from the company is more than 12%.
SELECT a.customer_name, b.salesman_name,b.commission from customers a inner JOIN salesman b ON a.salesman_id = b.salesman_id where b.commission>12;

-- Write an SQL statement to find the details of a order i.e. order number, order date, amount of order, which customer gives the order and which salesman works for that 
---customer and commission rate he gets for an order.

SELECT a.order_no, a.order_date,a.purchase_amount,b.customer_name,c.salesman_name,c.commission from orders a 
INNER JOIN customers b ON a.customer_id = b.customer_id 
INNER JOIN salesman c ON a.salesman_id =c.salesman_id;