# Write your MySQL query statement below
select Product.product_id, Product.product_name
from product, sales where product.product_id = sales.product_id and sale_date between '2019-01-01' and '2019-03-31' and sales.product_id not in (select product_id from sales where sale_date > '2019-03-31' or sale_date < '2019-01-01')
group by sales.product_id;