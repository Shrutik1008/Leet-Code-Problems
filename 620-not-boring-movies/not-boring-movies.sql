select * from cinema
where 
MOD(id,2) = 1
AND description != 'boring'
ORDER BY rating DESC;