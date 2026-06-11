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

-- null
SELECT name
FROM Customer
WHERE referee_id != 2
   OR referee_id IS NULL;
