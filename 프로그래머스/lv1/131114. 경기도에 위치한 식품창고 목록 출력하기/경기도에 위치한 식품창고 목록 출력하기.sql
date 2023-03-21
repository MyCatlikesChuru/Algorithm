-- 코드를 입력하세요
SELECT w.WAREHOUSE_ID,
    w.WAREHOUSE_NAME,
    w.ADDRESS,
    IFNULL(FREEZER_YN,'N') AS FREEZER_YN
FROM FOOD_WAREHOUSE w
WHERE ADDRESS LIKE '%경기도%'
ORDER BY w.WAREHOUSE_ID ASC;