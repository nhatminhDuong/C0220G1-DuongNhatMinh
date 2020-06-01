-- create database furama_spring_mvc;

create table staff_position (
	id int primary key not null,
    position_name varchar(45)
);

create table staff_qualification (
	id int primary key not null,
    qualification_name varchar(45)
);

create table staff_department (
	id int primary key not null,
    department_name varchar(45)
);

create table staff (
	id int primary key not null,
    full_name varchar(45),
    position_id int,
    qualification_id int,
    department_id int,
    date_of_birth date,
    identity_number varchar(45),
    salary varchar(45),
    phone_number varchar(45),
    email varchar(45),
    address varchar(45),
	foreign key (position_id) references staff_position(id),
	foreign key (qualification_id) references staff_qualification(id),
	foreign key (department_id) references staff_department(id)
);

create table customer_type (
	id int primary key not null,
    customer_type_name varchar(45)
);

create table customer (
	id int primary key not null,
    customer_type_id int,
    full_name varchar(45),
    date_of_birth Date,
    identity_number varchar(45),
    phone_number varchar(45),
    email varchar(45),
    address varchar(45),
    foreign key (customer_type_id) references customer_type(id)
);

create table rent_type (
	id int primary key not null,
    rent_type_name varchar(45)
);

create table service_type (
	id int primary key not null,
    service_type_name varchar(45)
);

create table service (
	id int primary key not null,
    service_name varchar(45),
    area int,
    number_of_floors int,
    maximum_people int,
    rent_fee varchar(45),
    rent_type_id int,
    service_type_id int,
    availability_status varchar(45),
    foreign key (rent_type_id) references rent_type(id),
    foreign key (service_type_id) references service_type(id)
);

create table accompanied_service (
	id int primary key not null,
    accompanied_service_name varchar(45),
    price int,
    unit int,
    availability_status varchar(45)
);

create table contract (
	id int primary key not null,
    staff_id int,
    customer_id int,
    service_id int,
    contract_date date,
    end_date date,
    deposit int,
    total_payment int,
    foreign key (staff_id) references staff(id),
    foreign key (customer_id) references customer(id),
    foreign key (service_id) references service(id)
);                    

create table detail_contract (
	id int primary key not null,
    contract_id int,
    accompanied_service_id int,
    amount int,
    foreign key (contract_id) references contract(id),
    foreign key (accompanied_service_id) references accompanied_service(id)
);

insert into staff_position (id, position_name)
values
(1, 'Receptionist'),
(2, 'Server'),
(3, 'Specialist'),
(4, 'Supervisor'),
(5, 'Manager'),
(6, 'Director');

insert into staff_qualification (id, qualification_name)
values
(1, 'Intermediate'),
(2, 'College'),
(3, 'Undergraduate'),
(4, 'Postgraduate');

insert into staff_department
values
(1, 'Sale-Marketing'),
(2, 'Administration'),
(3, 'Service board'),
(4, 'Management');

insert into customer_type
values
(1, 'Diamond'),
(2, 'Platinum'),
(3, 'Gold'),
(4, 'Silver'),
(5, 'Member');

insert into rent_type (id, rent_type_name)
values
(1, 'Year'),
(2, 'Month'),
(3, 'Day'),
(4, 'Hour');

insert into service_type (id, service_type_name)
values
(1, 'Villa'),
(2, 'House'),
(3, 'Room');

insert into accompanied_service (id, accompanied_service_name, price, unit, availability_status)
values
(1, 'Massage', 50, 1, 'available'),
(2, 'Karaoke', 25, 1, 'available'),
(3, 'Food', 20, 1, 'available'),
(4, 'Drinks', 15, 1, 'available'),
(5, 'Car', 60, 1, 'available');
