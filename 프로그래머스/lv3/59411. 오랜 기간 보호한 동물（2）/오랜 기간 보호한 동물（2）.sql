-- 코드를 입력하세요
SELECT o.ANIMAL_ID,
    o.NAME
FROM ANIMAL_INS o
LEFT JOIN ANIMAL_OUTS i
ON o.ANIMAL_ID = i.ANIMAL_ID
ORDER BY DATEDIFF(i.DATETIME, o.DATETIME) DESC
LIMIT 2;