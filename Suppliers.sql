create table supplier(
supplier_id numeric(5)primary key,
supplier_name varchar(150) not null,
address varchar(150),
city varchar(50),
state varchar(15),
country varchar(15),
contact varchar(10)
);


alter table supplier add constraint chk_contact_length check(length(contact)=10);
