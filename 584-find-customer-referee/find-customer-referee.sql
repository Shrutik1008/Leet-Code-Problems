select name from Customer 
where Coalesce(referee_id,0) !=2;