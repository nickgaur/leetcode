# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below
delete T1 from person as T1, person as T2 where T1.id > T2.id and T1.email = T2.email;