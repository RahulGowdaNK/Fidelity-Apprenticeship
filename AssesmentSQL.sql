create table workers(
worker_id int  primary key,
first_name varchar(50),
last_name varchar(50),
salary int,
joing_date date,
department varchar(50)
);
select * from workers;
insert into workers values (1,'Monika','Arora', 1000000,'2020-02-14','HR');
insert into workers values (2,'Niharika','Verma', 800000,'2011-02-14','Admin');
insert into workers values (3,'Vishal','singh', 3000000,'2020-02-14','HR');
insert into workers values (4,'Amitabh','singh', 5000000,'2020-02-14','Admin');
insert into workers values (5,'Vivek','Bhati', 5000000,'2011-06-14','Admin');
insert into workers values (6,'vipul','Diwan', 2000000,'2011-06-14','Account');
insert into workers values (7,'Satish','kumar', 750000,'2020-01-14','Account');
insert into workers values (8,'Geethika','chauhan', 900000,'2011-04-14','Admin');


create table bonus(
worker_ref_id int,
bonus_amount int,
bonus_date date
);
select *from bonus;

insert into bonus values(1,5000,'2020-02-16');
insert into bonus values(2,3000,'2011-06-16');
insert into bonus values(3,4000,'2020-02-16');
insert into bonus values(1,4500,'2020-02-16');
insert into bonus values(2,3500,'2011-02-16');

create table title(
worker_ref_id int,
worker_title varchar(50),
affected_from date
);

insert into title values (1,'Manager','2016-02-20');
insert into title values (2,'Excecutive','2016-06-11');
insert into title values (8,'Excecutive','2016-06-11');
insert into title values (5,'Manager','2016-06-11');
insert into title values (4,'Asst Manager','2016-06-11');
insert into title values (7,'Excecutive','2016-06-11');
insert into title values (6,'lead','2016-06-11');
insert into title values (3,'lead','2016-06-11');


select w.first_name, w.salary, t.worker_title from workers w
join title t
on w.worker_id =t.worker_ref_id;

create or replace function get_worker_count_by_nth_highest_salary(n int)
returns int as $$
declare 
nth_salary int;
worker_count int;

begin 
select distinct salary into nth_salary
from workers
order by salary desc
limit 1 offset n-1;

select count(*) into worker_count
from workers
where salary =nth_salary;

return worker_count;
end;
$$ language plpgsql;
select get_worker_count_by_nth_highest_salary(4);