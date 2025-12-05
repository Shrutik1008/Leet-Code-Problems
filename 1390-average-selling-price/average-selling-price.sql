# Write your MySQL query statement below
/* Write your T-SQL query statement below */
select product_id, round(coalesce(sum(price*units)*1.0/nullif(sum(units),0),0),2)  as average_price from 
(
 select p.product_id,
 p.price,
 u.units
from prices p
left join unitssold u
on p.product_id=u.product_id
and u.purchase_date  between p.start_date and p.end_date) as t
group by product_id