# Write your MySQL query statement below

select name, sum(amount) as balance
from users, transactions
where users.account = transactions.account
group by users.name
having sum(amount) > 10000;