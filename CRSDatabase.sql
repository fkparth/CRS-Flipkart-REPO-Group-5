use crsdatabase;

create table if not exists role(
id int primary key,
type varchar(255)
); 

create table if not exists user(
id int auto_increment primary key,
password varchar(255),
name varchar(255),
role_id int,
CONSTRAINT user_role_fk FOREIGN KEY (role_id) REFERENCES role(id)
); 

create table if not exists student(
id int  auto_increment primary key,
is_approved int default null,
CONSTRAINT student_user_fk FOREIGN KEY (id) REFERENCES user(id) 
);

create table if not exists professor(
id int  auto_increment primary key,
dept_id int,
CONSTRAINT professor_user_fk FOREIGN KEY (id) REFERENCES user(id) 
);

create table if not exists admin(
id int  auto_increment primary key,
CONSTRAINT admin_user_fk FOREIGN KEY (id) REFERENCES user(id) 
);

create table if not exists course(
id int  auto_increment primary key,
course_name varchar(255),
status int,
strength int,
professor_id int,
CONSTRAINT course_professor_fk FOREIGN KEY (id) REFERENCES professor(id) 
);


create table if not exists registeredCourses(
course_id int,
student_id int,
primary key(course_id, student_id),
grade varchar(3),
CONSTRAINT registered_course_fk FOREIGN KEY (course_id) REFERENCES course(id),
CONSTRAINT registered_student_fk FOREIGN KEY (student_id) REFERENCES student(id)
);

create table if not exists payment(
student_id int,
primary key(student_id),
payment_mode int,
status int,
CONSTRAINT payment_student_fk FOREIGN KEY (student_id) REFERENCES student(id)
);


create table if not exists notification(
id int primary key,
user_id int,
message varchar(255),
status int,
type int,
CONSTRAINT notification_user_fk FOREIGN KEY (user_id) REFERENCES user(id)
);


