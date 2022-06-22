package com.flipkart.constants;

public class SQLQueriesConstants {
    public static final String GET_USER_BY_ID= "select * from user where id = ?;";
    public static final String GET_STUDENT_TO_APPROVE="select * from student where is_approved= 0 ;";

    public static final String APPROVE_STUDENT_BY_ID="update student set is_approved=1 where id=? ;";

    public static final String CHOOSE_COURSE_PROF_LIST="select * from course where status =0;";

    public static final String CHOOSE_COURSE_PROF_SELECT = "update course set status=1 and professor_id = ? where id=?;";
    public static final String VIEW_STUDENT_LIST_COURSEID = "select * from course where professor_id=?;";

    public static final String VIEW_STUDENT_LIST_STUDENTID = "select * from registeredcourses where course_id =?;";

    public static final String VIEW_STUDENT_LIST_STUDENTNAME = "select * from user where id=?;";
    public static final String ADD_PROFESSOR_SET_USER = "insert into user (id,password,name,type) values (?,?,?,?); ";
    public static final String ADD_PROFESSOR_SET_PROF = "insert into professor (id,dept_id) values (?,?) ;";
}
