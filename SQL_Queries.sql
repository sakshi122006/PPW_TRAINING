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

-- self join 
SELECT w1.id
FROM Weather w1
JOIN Weather w2
ON DATEDIFF(w1.recordDate, w2.recordDate) = 1
WHERE w1.temperature > w2.temperature;

-- cross join 
SELECT s.student_id,
       s.student_name,
       sub.subject_name,
       COUNT(e.student_id) AS attended_exams
FROM Students s
CROSS JOIN Subjects sub
LEFT JOIN Examinations e
ON s.student_id = e.student_id
AND sub.subject_name = e.subject_name
GROUP BY s.student_id,
         s.student_name,
         sub.subject_name
ORDER BY s.student_id,
         sub.subject_name;

-- left join
SELECT e.name, b.bonus
FROM Employee e LEFT JOIN Bonus b
ON e.empId = b.empId
WHERE b.bonus < 1000 OR b.bonus IS NULL;

-- avg , round
SELECT p.project_id,
       ROUND(AVG(e.experience_years), 2) AS average_years
FROM Project p
JOIN Employee e
ON p.employee_id = e.employee_id
GROUP BY p.project_id;

-- round, count
SELECT contest_id,
       ROUND(COUNT(user_id) * 100.0 /
             (SELECT COUNT(*) FROM Users), 2) AS percentage
FROM Register
GROUP BY contest_id
ORDER BY percentage DESC, contest_id ASC;

-- round
SELECT p.product_id,
       ROUND(
           IFNULL(SUM(u.units * p.price) / SUM(u.units), 0),
           2
       ) AS average_price
FROM Prices p
LEFT JOIN UnitsSold u
ON p.product_id = u.product_id
AND u.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY p.product_id;

-- AND
SELECT product_id
FROM Products
WHERE low_fats = 'Y'
  AND recyclable = 'Y';

--min
SELECT player_id,
       MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;

--not in
SELECT name
FROM SalesPerson
WHERE sales_id NOT IN (
    SELECT o.sales_id
    FROM Orders o
    JOIN Company c
    ON o.com_id = c.com_id
    WHERE c.name = 'RED'
);

-- between
SELECT p.product_name,
       SUM(o.unit) AS unit
FROM Products p
JOIN Orders o
ON p.product_id = o.product_id
WHERE o.order_date BETWEEN '2020-02-01' AND '2020-02-29'
GROUP BY p.product_id, p.product_name
HAVING SUM(o.unit) >= 100;


-- left join
SELECT c.name AS Customers
FROM Customers c
LEFT JOIN Orders o
ON c.id = o.customerId
WHERE o.customerId IS NULL;

-- join 
SELECT d.name AS Department,
       e.name AS Employee,
       e.salary AS Salary
FROM Employee e
JOIN Department d
ON e.departmentId = d.id
WHERE (e.departmentId, e.salary) IN (
    SELECT departmentId, MAX(salary)
    FROM Employee
    GROUP BY departmentId
);

-- partition by
SELECT
    d.name AS Department,
    e.name AS Employee,
    e.salary AS Salary
FROM (
    SELECT *,
           DENSE_RANK() OVER (
               PARTITION BY departmentId
               ORDER BY salary DESC
           ) AS rnk
    FROM Employee
) e
JOIN Department d
ON e.departmentId = d.id
WHERE rnk <= 3;

-- limit
SELECT customer_number
FROM Orders
GROUP BY customer_number
ORDER BY COUNT(*) DESC
LIMIT 1;

-- if
UPDATE Salary
SET sex = CASE
              WHEN sex = 'm' THEN 'f'
              ELSE 'm'
          END;
