create table Delivery_partners(
partnerid serial  primary key,
partnername varchar(100) not null,
phonenum varchar(15) not null,
rating decimal(2,1) check (rating between 1 and 5)
);

select * from Delivery_partners;
insert into Delivery_partners values('117','Rahul','9990129689',2.0);
insert into Delivery_partners values('121','Jagadish','824445657',3.0);
insert into Delivery_partners values ('321','soujan','99567688',4.0);
 select partnerid, partnername, phonenum from Delivery_partners where rating between 3 and 5 order by partnerid;




create table customers(
customer_id varchar(10)primary key,
customer_name varchar(100) not null,
address varchar(150) not null,
phone_no varchar(15) not null,
email_id varchar(100) not null
);
select *from customers;
insert into customers values(101,'Ravi','Bangalore',990129668,'ravi@gmail.com');
insert into customers values(102,'Rajesh','Chennai',990199668,'rajeev@outlook.com');
insert into customers values(103,'Ragav','Bangaldesh',990899668,'ragav@hotmail.com');
insert into customers values(104,'Rajeevi','Goa',990129068,'rajeevgmail.com');

select customer_id,customer_name, address,phone_no from customers where email_id like '%gmail.com'order by customer_id;

alter table customers alter column customer_id type int using customer_id::integer;


create table hotel_details (
hotel_id serial primary key,
hotel_name varchar(100) not null,
hotel_type varchar(50) not null,
hotel_rating decimal(2,1) check ( hotel_rating between 1 and 5)
);
 select *from hotel_details;
 insert into hotel_details values ('1','Amaravathi','veg',4.6);
insert into hotel_details values('2','Royal Dine',' non-veg',4.7);
insert into hotel_details values('3','Ocean Breeze','veg',3.6);
insert into hotel_details values('4','Saffron Grill',' non-veg',3.8);

alter table hotel_details rename column hotel_rating to Rating;

select concat(hotel_name, '  is a  ' ,hotel_type,'  hotel') as hotel_info from hotel_details order by hotel_info desc;


create table orders(
order_id serial primary key,
customer_id int references customers(customer_id),
hotel_id int references hotel_details(hotel_id),
order_amount decimal(10,2) not null,
order_date date not null
 );
 
 insert into orders values(10,101,1,250.00,'2024-09-08');
 insert into orders values(20,102,2,850.00,'2024-09-09');
 insert into orders values(30,103,3,950.00,'2024-09-06');
SELECT *From orders;

select hd.hotel_id,hd.hotel_name,count(o.order_id) as no_of_orders from hotel_details hd join orders o on hd.hotel_id
= o.hotel_id group by hd.hotel_id ,hd.hotel_name having count(o.order_id)>5 order by hd.hotel_id asc;

 select hd.hotel_id, hd.hotel_name,hd.hotel_type from hotel_details hd left join orders o on hd.hotel_id= o.hotel_id
 and o.order_date between '2019-05-01' and '2019-05-31'
 where o.order_id is null order by hd.hotel_id asc;

 select o.orders_id,c.customer_name,h.hotel_name,o.order-amount from orders o
 join customers c on o.customer_id = c.customer_id 
 join hotel_details h on o.hotel_id =h.hotel_id order by o.order_id asc;


create table hungereats(
custid varchar(20),
custname varchar(30) not null,
address varchar(50),
phoneno int,
emailid varchar(20)
);
insert into hungereats values ('cust101','Thomas','kochi',990129,'thomas@gmail.com');
insert into hungereats values ('cust102','Keerthan','Allepy',990190,'keerthans@gmail.com');
insert into hungereats values ('cust103','Joseph','Bangalore',9990296,'Joseph@gmail.com');
insert into hungereats values ('cust104','Komal','surat',9781290,'komals@gmail.com');
insert into hungereats values ('cust105','Karan','koyambeedu',9901298,'karan@gmail.com');

update hungereats 
set phoneno=9995578 where custid='cust104';
select * from hungereats;

alter table hungereats alter column custid type int using custid::integer;









