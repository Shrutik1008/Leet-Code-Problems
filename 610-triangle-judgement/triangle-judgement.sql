# Write your MySQL query statement below
Select * ,
    CASE 
        WHEN x+y>z AND x+z>y And y+z>x Then 'Yes'
        else 'No'
    END AS triangle
FROM Triangle
