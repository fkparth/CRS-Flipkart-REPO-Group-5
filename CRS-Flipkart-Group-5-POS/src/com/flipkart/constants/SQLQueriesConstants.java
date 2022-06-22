package com.flipkart.constants;

public class SQLQueriesConstants {
    public static final String GET_USER_BY_ID= "select * from user where id = ?;";
    public static final String GET_STUDENT_TO_APPROVE="select * from student where is_approved= 0 ;";

    public static final String APPROVE_STUDENT_BY_ID="update student set is_approved=1 where id=? ;";

}
