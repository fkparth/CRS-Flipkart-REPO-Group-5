package com.flipkart.dao;

import com.flipkart.bean.Student;
import com.flipkart.constants.SQLQueriesConstants;
import com.flipkart.exceptions.*;
import com.flipkart.utils.DBConnection;

import java.sql.*;
import java.util.Scanner;

public class StudentDAOoperation implements StudentDAO{
    private PreparedStatement statement = null;
    @Override
    public void register(Student stud) throws SQLException, RegistrationUnsuccessfulException {

        Scanner sc=new Scanner(System.in);
        Connection connection = DBConnection.getConnection();

        try {
            String sql = SQLQueriesConstants.GET_REGISTERED_COURSE_STUDENT_ID;
            int stdid=stud.getUserId();
            PreparedStatement stmt=connection.prepareStatement(sql);
            stmt.setInt(1,stdid);
            boolean flag=false;
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                flag=true;
            }
            if (flag)
                throw new RegistrationUnsuccessfulException();

            sql = SQLQueriesConstants.REGISTER_COURSE;

            stmt=connection.prepareStatement(sql);

            System.out.println("Give you primary preferences");
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
        } catch (SQLException se) {
            System.out.println(se.getMessage());
            //throw new RegistrationUnsuccessfulException();
        }
    }

    @Override
    public Student fetchStudentData(int id) throws SQLException, UserNotFoundException {
        Connection connection = DBConnection.getConnection();
        System.out.println("Done");

        try {
            Student stud = new Student();
            String sql = SQLQueriesConstants.GET_USER_BY_ID;
            statement=connection.prepareStatement(sql);
            statement.setInt(1,id);
            ResultSet rs = statement.executeQuery();
            boolean flag = false;
            while (rs.next()) {
                String sql2 = SQLQueriesConstants.GET_STUDENT_BY_ID;
                PreparedStatement statement2=connection.prepareStatement(sql2);
                statement2.setInt(1,id);
                ResultSet rs2 = statement2.executeQuery();

                while (rs2.next()) {
                    int test = rs2.getInt("is_approved");
                    if (test == 0) {
                        System.out.println("Waiting for admin approval");
                        return null;
                    }
                }
                stud.setUserId(rs.getInt("id"));
                stud.setName(rs.getString("name"));
                stud.setType(rs.getInt("type"));
                stud.setPassword(rs.getString("password"));
                flag = true;
            }
            if(!flag){
                throw new UserNotFoundException(id);
            }
            return stud;
        } catch (SQLException se) {
            throw new UserNotFoundException(id);
        }
    }

    @Override
    public void viewGradesheet(int id) throws SQLException, NoRegisteredCoursesException {
        Connection connection = DBConnection.getConnection();
        System.out.println("Done");

        try {
            String sql = SQLQueriesConstants.GET_REGISTERED_COURSE_STUDENT_ID;
            statement=connection.prepareStatement(sql);
            statement.setInt(1,id);
            ResultSet rs = statement.executeQuery();
            System.out.println("Course ID    Course Name    Grade");
            boolean flag = false;
            while (rs.next()) {
                flag = true;
                int cid=rs.getInt("course_id");
                String sql2=SQLQueriesConstants.GET_COURSE_BY_ID;
                PreparedStatement st2=connection.prepareStatement(sql2);
                st2.setInt(1,cid);
                ResultSet rs2=st2.executeQuery();

                while(rs2.next()){
                    System.out.println(cid+"    "+rs2.getString("course_name")+"    "+rs.getString("grade"));
                }
            }

            if (!flag) {
                throw new NoRegisteredCoursesException(id);
            }
        } catch (SQLException se) {
            System.out.println(se.getMessage());
            throw se;
        }
    }

    @Override
    public void viewCourseCatalogue() throws SQLException {
        Connection connection = DBConnection.getConnection();
        System.out.println("Done");
        String sql = SQLQueriesConstants.GET_COURSE_CATALOG;
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(sql);
        System.out.println("CourseID - Course-Name");
        while(rs.next()){
            System.out.println(rs.getInt("id")+"    "+rs.getString("course_name"));//+"     "+rs.getInt("strength"));
        }
    }

    @Override
    public void addCourses(Student stud) throws SQLException, CourseNotAddedException {
        System.out.println("Add Course");
        Scanner sc=new Scanner(System.in);
        Connection connection = DBConnection.getConnection();

        try {
            String sql = SQLQueriesConstants.STUDENT_ADD_COURSE;

            PreparedStatement stmt=connection.prepareStatement(sql);
            int stdid=stud.getUserId();
            //System.out.println(stdid+"hi bro");

            System.out.println("Enter course ID");
            int courseid=sc.nextInt();
            stmt.setInt(1,courseid);
            stmt.setInt(2,stdid);
            stmt.execute();
        } catch (SQLException se) {
            throw new CourseNotAddedException();
        }
    }

    @Override
    public void dropCourses(Student stud) throws SQLException, CourseNotDroppedException {
        System.out.println("Drop Course");
        Scanner sc=new Scanner(System.in);
        Connection connection = DBConnection.getConnection();

        try {
            String sql = SQLQueriesConstants.STUDENT_DROP_COURSE;

            PreparedStatement stmt=connection.prepareStatement(sql);
            int stdid=stud.getUserId();
            //System.out.println(stdid+"hi bro");

            System.out.println("Enter course ID");
            int courseid=sc.nextInt();
            stmt.setInt(1,courseid);
            stmt.setInt(2,stdid);
            stmt.execute();
        } catch (SQLException se) {
            throw new CourseNotDroppedException();
        }
    }

    @Override
    public void feePayment(Student stud) throws SQLException, PaymentUnsuccessfulException {
        Connection connection = DBConnection.getConnection();

        int stdid=stud.getUserId();

        try {
            String sql = SQLQueriesConstants.STUDENT_GET_PAYMENT_STATUS;
            statement=connection.prepareStatement(sql);
            statement.setInt(1,stdid);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                int pay_status = rs.getInt("status");

                if(pay_status == 1) {
                    System.out.println("Fee already paid.");
                    throw new PaymentAlreadyExistsException();
                }
            }

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter payment mode:");
            System.out.println("1. Cash");
            System.out.println("2. Debit Card");
            System.out.println("3. Credit Card");
            int paymentMode = sc.nextInt();
            sql = SQLQueriesConstants.STUDENT_SET_PAYMENT;
            statement=connection.prepareStatement(sql);
            statement.setInt(1, stdid);
            statement.setInt(2, paymentMode);
            statement.setInt(3, 1);
            statement.execute();

        } catch (SQLException se) {
            throw new PaymentUnsuccessfulException(stdid);
        } catch (PaymentAlreadyExistsException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void viewCourses(int id) throws SQLException, NoRegisteredCoursesException {
        Connection connection = DBConnection.getConnection();
        System.out.println("Done");

        try {
            String sql = SQLQueriesConstants.GET_REGISTERED_COURSE_STUDENT_ID;
            statement=connection.prepareStatement(sql);
            statement.setInt(1,id);
            ResultSet rs = statement.executeQuery();
            System.out.println("Course ID    Course Name");

            boolean flag = false;

            while (rs.next()) {
                flag = true;
                int cid=rs.getInt("course_id");
                String sql2=SQLQueriesConstants.GET_COURSE_BY_ID;
                PreparedStatement st2=connection.prepareStatement(sql2);
                st2.setInt(1,cid);
                ResultSet rs2=st2.executeQuery();

                while(rs2.next()){
                    System.out.println(cid+"    "+rs2.getString("course_name"));
                }
            }

            if (!flag) {
                throw new NoRegisteredCoursesException(id);
            }
        } catch (SQLException se) {
            throw new NoRegisteredCoursesException(id);
        }


    }
}
