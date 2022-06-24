drop database if exists CRSDatabase;

create database CRSDatabase;

use crsdatabase;

drop TABLE if exists role;
create table if not exists role(
type int primary key,
role varchar(255)
); 

drop TABLE if exists user;
create table if not exists user(
id int auto_increment primary key,
password varchar(255),
name varchar(255),
type int,
CONSTRAINT user_role_fk FOREIGN KEY (type) REFERENCES role(type)
); 

drop TABLE if exists student;
create table if not exists student(
id int  auto_increment primary key,
is_approved int default null,
CONSTRAINT student_user_fk FOREIGN KEY (id) REFERENCES user(id) 
);

drop TABLE if exists professor;
create table if not exists professor(
id int  auto_increment primary key,
dept_id int,
CONSTRAINT professor_user_fk FOREIGN KEY (id) REFERENCES user(id) 
);

drop TABLE if exists admin;
create table if not exists admin(
id int  auto_increment primary key,
CONSTRAINT admin_user_fk FOREIGN KEY (id) REFERENCES user(id) 
);

drop TABLE if exists course;
create table if not exists course(
id int  auto_increment primary key,
course_name varchar(255),
status int,
strength int,
professor_id int,
CONSTRAINT course_professor_fk FOREIGN KEY (professor_id) REFERENCES professor(id) 
);


drop TABLE if exists registeredCourses;
create table if not exists registeredCourses(
course_id int,
student_id int,
primary key(course_id, student_id),
grade varchar(3),
CONSTRAINT registered_course_fk FOREIGN KEY (course_id) REFERENCES course(id),
CONSTRAINT registered_student_fk FOREIGN KEY (student_id) REFERENCES student(id)
);

drop TABLE if exists payment;
create table if not exists payment(
student_id int,
primary key(student_id),
payment_mode int,
status int,
CONSTRAINT payment_student_fk FOREIGN KEY (student_id) REFERENCES student(id)
);


drop TABLE if exists notification;
create table if not exists notification(
id int primary key,
user_id int,
message varchar(255),
status int,
type int,
CONSTRAINT notification_user_fk FOREIGN KEY (user_id) REFERENCES user(id)
);

select * from role;
INSERT INTO `crsdatabase`.`role` (`type`, `role`) VALUES ('1', 'Student');
INSERT INTO `crsdatabase`.`role` (`type`, `role`) VALUES ('2', 'Professor');
INSERT INTO `crsdatabase`.`role` (`type`, `role`) VALUES ('3', 'Admin');

select * from user;
INSERT INTO `crsdatabase`.`user` (`id`, `password`, `name`, `type`) VALUES ('301', 'pass', 'shruti', '3');

select * from admin;
INSERT INTO `crsdatabase`.`admin` (`id`) VALUES ('301');
