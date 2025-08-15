
Select A.name as Customers from Customers as A
where A.Id not in (Select B.customerId from Orders B )