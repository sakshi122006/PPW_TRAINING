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

-- order by
SELECT DISTINCT author_id AS id
FROM Views
WHERE author_id = viewer_id
ORDER BY id;

-- length
SELECT tweet_id
FROM Tweets
WHERE LENGTH(content) > 15;
