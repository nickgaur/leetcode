CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
declare var int;
set var = n-1;
  RETURN (
      # Write your MySQL query statement below.
      select distinct salary from Employee
      order by salary desc limit var, 1
  );
END