--inner join
SELECT Product.product_name, Sales.year, Sales.price
FROM Product, Sales
WHERE Product.product_id = Sales.product_id;

--left join
SELECT v.customer_id,
       COUNT(*) AS count_no_trans
FROM Visits v
LEFT JOIN Transactions t
ON v.visit_id = t.visit_id
WHERE t.transaction_id IS NULL
GROUP BY v.customer_id;
