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

-- avg
SELECT query_name,
       ROUND(AVG(rating * 1.0 / position), 2) AS quality,
       ROUND(AVG(CASE WHEN rating < 3 THEN 1 ELSE 0 END) * 100, 2)
       AS poor_query_percentage
FROM Queries
GROUP BY query_name;

-- count
SELECT teacher_id,
       COUNT(DISTINCT subject_id) AS cnt
FROM Teacher
GROUP BY teacher_id;

-- delete
DELETE p1
FROM Person p1, Person p2
WHERE p1.email = p2.email
AND p1.id > p2.id;

-- substring
SELECT user_id,
       CONCAT(
           UPPER(LEFT(name, 1)),
           LOWER(SUBSTRING(name, 2))
       ) AS name
FROM Users
ORDER BY user_id;

-- count
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;

-- order by 
SELECT user_id,
       COUNT(follower_id) AS followers_count
FROM Followers
GROUP BY user_id
ORDER BY user_id;

-- having
SELECT MAX(num) AS num
FROM (
    SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(num) = 1
) AS single_numbers;

-- join
SELECT s.product_id,
       s.year AS first_year,
       s.quantity,
       s.price
FROM Sales s
JOIN (
    SELECT product_id, MIN(year) AS first_year
    FROM Sales
    GROUP BY product_id
) t
ON s.product_id = t.product_id
AND s.year = t.first_year;

--betwwen
SELECT activity_date AS day,
       COUNT(DISTINCT user_id) AS active_users
FROM Activity
WHERE activity_date BETWEEN '2019-06-28' AND '2019-07-27'
GROUP BY activity_date;

-- order by
SELECT id, movie, description, rating
FROM Cinema
WHERE id % 2 != 0
  AND description != 'boring'
ORDER BY rating DESC;
