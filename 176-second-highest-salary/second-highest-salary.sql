Select Max(Salary) as SecondHighestSalary
from employee 
where salary<(select max(salary) from employee);