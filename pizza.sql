create table pizza(
pizza_id serial primary key,
pizza_name varchar(100)not null,
pizza_size varchar(50) not null,
price decimal(6,2),
is_vegetarian boolean default false,
created_at timestamp default current_timestamp
);
select *from pizza;
update pizza set price = price * 0.97
where pizza_size ='Extra large';

create table delivery_partners(
partner_id serial primary key,
partner_name varchar(45),
contact_number varchar(15),
rating decimal(3,2) default 5.0,

);
select*from delivery_partners;


create table customer(
customerid serial primary key,
customername varchar(100)
email varchar(100)unique,
contactnum varchar(15),
delivery_address text not null,

);