-- 코드를 입력하세요
SELECT RE.REST_ID, RI.REST_NAME, RI.FOOD_TYPE, RI.FAVORITES,
    RI.ADDRESS, ROUND(AVG(RE.REVIEW_SCORE), 2) AS SCORE
FROM REST_REVIEW RE
JOIN (
    SELECT * 
    FROM REST_INFO
    WHERE ADDRESS LIKE '서울%'
    ) RI
ON RI.REST_ID = RE.REST_ID
GROUP BY RE.REST_ID
ORDER BY SCORE DESC, FAVORITES DESC
;
# SELECT R.REST_ID,
#     I.REST_NAME,
#     I.FOOD_TYPE,
#     I.FAVORITES,
#     I.ADDRESS,
#     ROUND(AVG(R.REVIEW_SCORE),2) AS SCORE
# FROM REST_REVIEW R
# LEFT JOIN (
#     SELECT * 
#     FROM REST_INFO 
#     WHERE ADDRESS LIKE '서울%'
#     ) I
# ON R.REST_ID = I.REST_ID
# # WHERE I.ADDRESS LIKE '서울%'
# GROUP BY R.REST_ID
# ORDER BY SCORE DESC, I.FAVORITES;