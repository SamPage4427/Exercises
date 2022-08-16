--Select practice:
select * from "Employee";
select * from "Employee" where "LastName" = 'King';
select * from "Employee" where "FirstName" = 'Andrew' and "ReportsTo" isnull;
select * from "Album" order by "Title"  desc;
select "FirstName" from "Customer" order by "Address" asc;
select * from "Invoice" where "BillingAddress" like 'T%';
select * from "Invoice" where "Total" between 15 and 30;
select * from "Employee" where "HireDate" between '2003-06-01' and '2004-03-01';

--Insert Practice:
insert into "Genre" values (26, 'Mumble Rap');
insert into "Genre" values (27, 'Country');
insert into "Employee" values (9, 'Page','Sam','IT Staff',6,'1997-12-17','2020-06-01','11120 Jasper Ave NE','Quebec','AB','Canada','T5K 2N1','+1(780)885-6569','+1(780)885-8986','sam@chinookcorp.com');
insert into "Employee" values (10, 'Nowlin','Billy','IT Staff',6,'1998-03-29','2020-06-14','11120 Jasper Ave NE','Quebec','AB','Canada','T5K 2N1','+1(780)898-6564','+1(780)865-8584','billy@chinookcorp.com');
insert into "Customer" values (60, 'William', 'Forset', null, '205 Lupus Ave', 'London', null, 'United Kingdom', 'SW1V 3EN', '+44 020 7477 0658', null, 'willforset@gmail.com', 7);
insert into "Customer" values (61, 'Bill', 'Nguyen', null, '209 Lupin Ave', 'London', null, 'United Kingdom', 'SW1V 3EN', '+44 021 7577 1569', null, 'BNguyen@gmail.com', 6);

--update practice:
update "Customer" set "FirstName" = 'Robert' where "FirstName" = 'Aaron';
update "Customer" set "LastName" = 'Walter' where "LastName" = 'Mitchell';
update "Artist" set "Name" = 'CCR' where "Name" = 'Creedence Clearwater Revival';