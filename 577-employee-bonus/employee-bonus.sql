SELECT a.name,b.bonus
from employee as a left join bonus as b on a.empid = b.empid 
where ifnull(b.bonus,0) < 1000