-- JOIN and GROUP BY
-- how many employees are in the office...I want to see the office name and the count of the employess in that office
-- group by is called an aggregate function b/c we can make things into groups and then find information about that group
select * from employees;
select * from offices;

-- step 1 ... just get the count of the offices ids 
select office_id, count(*) 
from employees
group by office_id;

-- step 2 ... we added on the name of the office which forced us to add another
select o.city, e.office_id, count(*) 
from employees e, offices o
where e.office_id = o.id
group by office_id;

-- just an example of finding the count of all the same first name
select firstname, count(*) from employees
group by firstname;

-- find the employees that has the most customers
-- step 1
select sales_rep_employee_id, count(*)
from customers
group by sales_rep_employee_id
order by count(*) desc;

-- step 2 added on the employee table to get the employee name
select e.firstname, e.lastname, sales_rep_employee_id, count(*)
from customers c, employees e
where c.sales_rep_employee_id = e.id
group by sales_rep_employee_id
order by count(*) desc;

-- i want to see a list of all customers for the San Francisco office
--- 1 step
select * 
from offices o
where o.id = 1;
-- 2 step
select e.firstname, e.lastname, o.city
from offices o, employees e
where o.id = 1 and e.office_id = o.id;
-- 3 step
select e.firstname, e.lastname, o.city, c.customer_name, c.contact_firstname, c.contact_lastname
from offices o, employees e, customers c
where o.id = 1 
	and e.office_id = o.id
    and c.sales_rep_employee_id = e.id;
    
-- I ant to see of all customers, the sales rep, and the office name
select e.firstname, e.lastname, o.city, c.customer_name, c.contact_firstname, c.contact_lastname
from offices o, employees e, customers c
where e.ofice_id = o.id 
    and c.sales_rep_employee_id = e.id;
    
-- I want to see all of the customers that have made and order, and I want to see the customer name, the office, the employee name, and the order id and the order date
select * from orders;
select e.firstname, e.lastname, o.city, c.customer_name, c.contact_firstname, c.contact_lastname, ord.id as order_id, ord.order_date
from offices o, employees e, customers c, orders ord
where e.office_id = o.id
    and c.sales_rep_employee_id = e.id
    and ord.customer_id = c.id
order by e.id, customer_name;

-- I want to see the list of all products purchased. I want to see the customer name, the office, the employee name, the order id and date, AND the product id and quantity ordered. 
select * from orders;
select * from orderdetails;
select e.firstname, e.lastname, o.city, c.customer_name, c.contact_firstname, c.contact_lastname, ord.id as order_id, ord.order_date, ord.order_date, od.product_id, od.quantity_ordered
from offices o, employees e, customers c, orders ord, orderdetails od
where e.office_id = o.id
    and c.sales_rep_employee_id = e.id
    and ord.customer_id = c.id
    and od.order_id = ord.id
order by e.id, customer_name, order_id;

-- Everything from the previus report...now i want to add the product name
-- 3 STEPS to joing tables
-- 1 ) Add the table to the where clause
-- 2 ) Join tables in the where clause
-- 3 ) Add any columns desired to the select statement
select * from orders;
select * from orderdetails;
select e.firstname, e.lastname, o.city, c.customer_name, c.contact_firstname, c.contact_lastname, ord.id as order_id, ord.order_date, ord.order_date, od.product_id, od.quantity_ordered, p.product_name
from offices o, employees e, customers c, orders ord, orderdetails od, products p
where e.office_id = o.id
    and c.sales_rep_employee_id = e.id
    and ord.customer_id = c.id
    and od.order_id = ord.id
    and od.product_id = p.id
order by e.id, customer_name, order_id, product_name;


-- I want to see all the products htat have been ordered and how many times each produt has been ordered (note this is different than the quantity ordered) 
-- in the report I wan to see the order number, and the times it was purchased
-- and I want to see the prodcut the was ordered the most on top
-- hint 1 - the orderdetails table will contain 1 record for each time the product was ordered
-- hint 2 - needs a group by
select od.order_id as order_number, count(*)
from products p, orderdetails od
where od.product_id = p.id
group by od.order_id
order by od.order_id; 

select * from orderdetails where order_id = 10100 order by id;
