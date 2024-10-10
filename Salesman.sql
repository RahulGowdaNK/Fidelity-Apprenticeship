create table salesman(
salesman_id int primary key,
salesman_name varchar(100) not null,
salesman_city varchar(15),
commission_amt decimal(5,2)
);
go

create table orders(
order_id int primary key,
order_date date not null,
customer_id int ,
total_amount decimal(10,2),
salesman_id int,
constraint fk_salesman foreign key (salesman_id) references salesman(salesman_id)
);
go

