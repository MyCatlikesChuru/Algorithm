-- 코드를 입력하세요
WITH RECURSIVE TIME AS (
    SELECT 0 AS HOUR
    UNION ALL
    SELECT HOUR+1 FROM TIME WHERE HOUR < 23 
)

# SELECT T.HOUR,
#     IF(O.COUNT IS NULL, 0, O.COUNT) AS COUNT
# FROM TIME T
# LEFT JOIN (
#     SELECT HOUR(DATETIME) AS HOUR,
#         COUNT(*) AS COUNT
#     FROM ANIMAL_OUTS
#     GROUP BY HOUR) O
# ON T.HOUR = O.HOUR;

SELECT T.HOUR,
    COUNT(DATETIME) AS COUNT
FROM TIME T
LEFT JOIN ANIMAL_OUTS O
ON T.HOUR = HOUR(O.DATETIME)
GROUP BY T.HOUR;