-- 코드를 입력하세요
SELECT p.PRODUCT_CODE,
    SUM(p.PRICE * o.SALES_AMOUNT) AS SALES
FROM OFFLINE_SALE o
LEFT JOIN PRODUCT p 
ON p.PRODUCT_ID = o.PRODUCT_ID
GROUP BY p.PRODUCT_CODE
ORDER BY SALES DESC, p.PRODUCT_CODE ASC;