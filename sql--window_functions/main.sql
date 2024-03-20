-- WINDOW FUNCTIONS

-- #1 row_number() - Assigns row number to each record 

-- fetch first 2 employees from each dept who joins the company 

SELECT * 
FROM 
(
    SELECT e.*,
            row_number() OVER(PARTITION BY dept_name ORDER BY emp_id) AS rn
    FROM employees        
) x 
WHERE x.rn < 3;



-- #2 rank() - assigns rank to each record, in case of tie, it skips the subsequent number 

-- fetch top 3 employees in each dept earning max salary 

SELECT *
FROM 
(
    SELECT e.*,
            rank() OVER(PARTITION BY dept_name ORDER BY salary DESC) as rnk
    FROM employees         
) x 
WHERE x.rnk < 4;



-- #3 lead() and lag() - 

-- Fetch a query to display if the salary of an employee 
-- is higher, lower or equal to previous employee 


SELECT e.*,
LAG(salary) OVER(PARTITION BY dept_name ORDER BY empi_id) as prev_emp_sal,
CASE
    WHEN e.sal<LAG(salary) OVER(PARTITION BY dept_name ORDER BY empi_id) THEN 'Lower than prev emp'
    WHEN e.sal>LAG(salary) OVER(PARTITION BY dept_name ORDER BY empi_id) THEN 'Higher than prev emp'
    WHEN e.sal=LAG(salary) OVER(PARTITION BY dept_name ORDER BY empi_id) THEN 'Same as prev emp'
END AS sal_range
FROM employee AS e;
    


















