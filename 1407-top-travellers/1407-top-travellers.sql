# Write your MySQL query statement below

select name, 
case when distance is not null 
     then sum(distance) 
     else 0 
     end as travelled_distance 
from users left outer join rides on(users.id = rides.user_id)
group by rides.user_id 
order by travelled_distance DESC, name;



