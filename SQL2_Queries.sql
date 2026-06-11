-- and
SELECT product_id
FROM Products
WHERE low_fats = 'Y'
  AND recyclable = 'Y';

-- or
SELECT name, population, area
FROM World
WHERE area >= 3000000
   OR population >= 25000000;
