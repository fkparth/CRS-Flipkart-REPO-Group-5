package com.flipkart.dao;

import com.flipkart.bean.Student;
import com.flipkart.constants.SQLQueriesConstants;
import com.flipkart.utils.DBConnection;

import java.sql.*;
import java.util.Scanner;

public class StudentDAOoperation implements StudentDAO{
    private PreparedStatement statement = null;
    @Override
    public void register(Student stud) throws SQLException {
        System.out.println("Give you primary preferences");
        Scanner sc=new Scanner(System.in);
        Connection connection = DBConnection.getConnection();
        String sql = SQLQueriesConstants.REGISTER_COURSE;

        PreparedStatement stmt=connection.prepareStatement(sql);
        int stdid=stud.getUserId();
        //System.out.println(stdid+"hi bro");
        for (int i=0;i<4;i++){
            System.out.println("Enter course ID");
            int courseid=sc.nextInt();
            stmt.setInt(1,courseid);
            stmt.setInt(2,stdid);
            stmt.execute();

        }
        System.out.println("Give you alternative preferences");
        for (int i=0;i<2;i++){
            System.out.println("Enter course ID");
            int id=sc.nextInt();
        }
    }

    @Override
    public Student fetchStudentData(int id) throws SQLException {
        Connection connection = DBConnection.getConnection();
        System.out.println("Done");
        Student stud = new Student();
        String sql = SQLQueriesConstants.GET_USER_BY_ID;
        statement=connection.prepareStatement(sql);
        statement.setInt(1,id);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            stud.setUserId(rs.getInt("id"));
            stud.setName(rs.getString("name"));
            stud.setType(rs.getInt("type"));
            stud.setPassword(rs.getString("password"));
        }
        return stud;


    }

    @Override
    public void viewGradesheet() {

    }

    @Override
    public void viewCourseCatalogue() throws SQLException {
        Connection connection = DBConnection.getConnection();
        System.out.println("Done");
        String sql = SQLQueriesConstants.GET_COURSE_CATALOG;
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(sql);
        System.out.println("CourseID - Course-Name - Strength ");
        while(rs.next()){
            System.out.println(rs.getInt("id")+"    "+rs.getString("course_name")+"     "+rs.getInt("strength"));
        }
    }

    @Override
    public void addCourses(Student stud) {

    }

    @Override
    public void dropCourses(Student stud) {

    }

    @Override
    public void feePayment() {

    }

    @Override
    public void viewCourses(Student stud) {

    }
}
