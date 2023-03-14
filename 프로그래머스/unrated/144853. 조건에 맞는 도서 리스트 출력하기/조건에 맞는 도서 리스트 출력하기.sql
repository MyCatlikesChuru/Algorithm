-- 코드를 입력하세요
SELECT b.BOOK_ID, DATE_FORMAT(b.PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE FROM BOOK b
WHERE CATEGORY = '인문' AND PUBLISHED_DATE BETWEEN '2021-01-01' AND '2021-12-31'
ORDER BY PUBLISHED_DATE ASC;