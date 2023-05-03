-- 코드를 입력하세요
SELECT 
    MONTH(START_DATE) as MONTH,
    CAR_ID ,
    count(HISTORY_ID) as RECORDS
from 
    CAR_RENTAL_COMPANY_RENTAL_HISTORY
where 
    CAR_ID in( select CAR_ID 
                from CAR_RENTAL_COMPANY_RENTAL_HISTORY
                where MONTH(START_DATE) between 8 and 10
                group by CAR_ID
                having count(*)>=5)
    and MONTH(START_DATE) between 8 and 10 
group by MONTH , CAR_ID
order by  MONTH asc, CAR_ID desc