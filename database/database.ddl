
-- change this to your team id
use MLP204;



create table employee (first_name varchar(20),
 second_name varchar(20),
emp_id int primary key, 
email_id varchar(30),
 contact_no int(20) , 
 address varchar(50),
 designation varchar(15), 
 blood_group varchar(20),
 manager_id varchar(30),
 date_of_joining date);
alter table employee add column dept_name varchar(30);
alter table employee add column dept_id int;


create table leaves (emp_id int,
Leave_starting_date date not null,
Leave_ending_date date not null,
Leave_left int,
Leave_reason varchar(50)null,
Notification_status varchar(10) null,
leave_status varchar(40) null,
leave_id int auto_increment primary key,
leave_type varchar(20),
total_leaves int) 
;
