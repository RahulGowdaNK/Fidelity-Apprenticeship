create table tblCustomers(
custid serial primary key,
custname varchar(100) not null,
contactname varchar(100),
country varchar(50)
);
select*from tblCustomers;
create table tblsuppliers(
supId serial primary key,
supName varchar(100) not null
);
select* from tblsuppliers;

create table tblproducts(
productid serial primary key,
productname varchar(100) not null,
supId int,
foreign key (supId)references tblsuppliers(supId)
);
select * from tblproducts;

create table tblshippers(
shippersid serial primary key,
companyname Varchar(100) unique not null
);
select * from tblshippers;
create table tblorders(
orderid serial primary key,
custid int,
orderdate date not null,
shippeddate date,
foreign key(custid)references tblCustomers(custid) on delete cascade,
check (shippeddate > orderdate)
);
select *from tblorders;
create table tblorderdetails(
orderdetails serial primary key,
orderid int,
productid int,
quantity int check (quantity>10),
foreign key(orderid) references tblorders(orderid) on delete cascade,
foreign key(productid) references tblproducts(productid) on delete cascade
);
select * from tblorderdetails;
insert into tblCustomers(custname,contactname,country)
values('John Doe','John','USA'),('John cena','cena','canada');

insert into tblsuppliers(supname)
values('ACME Brown'),('Global suppliers');

insert into tblproducts(productname , supid)
values('Laptop',1),('Mouse',2);

insert into tblshippers(companyname)
values('Fastrack shipping'),('Express Delivery');

insert into tblorders(custid,orderdate,shippeddate)
values(1,'2024-10-08','2024-10-10'),
(2,'2024-10-07','2024-10-09');

insert into tblorderdetails(orderid,productid,quantity)
values(1,1,15),
(2,2,20);

