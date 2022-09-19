
SELECT Product.product_id, Product.product_name
FROM product, sales 
WHERE product.product_id = sales.product_id 
AND sale_date BETWEEN '2019-01-01' AND '2019-03-31' 
AND 
sales.product_id NOT IN 
(SELECT product_id 
 FROM sales 
 WHERE sale_date > '2019-03-31' OR sale_date < '2019-01-01')
GROUP BY sales.product_id;