# Write your MySQL query statement below

select name as Customers from customers where customers.id not in 
(select customers.id from customers, orders where customers.id = orders.customerId);