package com.flipkart.dao;
import com.flipkart.bean.*;
import com.flipkart.constants.SQLQueriesConstants;
import com.flipkart.utils.DBConnection;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class ProfessorDAOoperation implements ProfessorDAO{
    private PreparedStatement statement = null;
    @Override
    public void chooseCourse(int id) throws SQLException {
        Connection connection = DBConnection.getConnection();
        String sql = SQLQueriesConstants.VIEW_STUDENT_LIST_COURSEID;
        statement=connection.prepareStatement(sql);
        statement.setInt(1,id);
        ResultSet rs = statement.executeQuery();
        //System.out.println("Here are list of available Courses:");
        int courseid = -1;
        while (rs.next()) {
            courseid = (rs.getInt("id"));
            //System.out.println(courseid+"c");
        }
        if (courseid!=-1){
            System.out.println("Already teaching course with id : "+ courseid);
            return;
        }
        sql = SQLQueriesConstants.CHOOSE_COURSE_PROF_LIST;
        statement=connection.prepareStatement(sql);
        rs = statement.executeQuery();
        System.out.println("Here are list of available Courses:");
        while (rs.next()) {
            Course course = new Course();
            course.setCourseId(rs.getInt("id"));
            course.setCourseName(rs.getString("course_name"));
            System.out.println(course.getCourseId()+" : "+course.getCourseName());
        }
        System.out.println("Enter Course Code :");
        Scanner sc = new Scanner(System.in);
        int ccode = sc.nextInt();

        sql = SQLQueriesConstants.CHOOSE_COURSE_PROF_SELECT;
        statement=connection.prepareStatement(sql);
        statement.setInt(1,id);
        statement.setInt(2,ccode);
        statement.executeUpdate();
        System.out.println("Chosen Course ID:"+ccode);
    }
    @Override
    public Professor fetchProfessorData(int id) throws SQLException {
        Connection connection = DBConnection.getConnection();
        System.out.println("Done");
        Professor prof = new Professor();
        String sql = SQLQueriesConstants.GET_USER_BY_ID;
        statement=connection.prepareStatement(sql);
        statement.setInt(1,id);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            prof.setUserId(rs.getInt("id"));
            prof.setName(rs.getString("name"));
            prof.setType(rs.getInt("type"));
            prof.setPassword(rs.getString("password"));
        }
        return prof;
    }

    @Override
    public void viewStudentsList(int id) throws SQLException{
        Connection connection = DBConnection.getConnection();
        String sql = SQLQueriesConstants.VIEW_STUDENT_LIST_COURSEID;
        statement=connection.prepareStatement(sql);
        statement.setInt(1,id);
        ResultSet rs = statement.executeQuery();
        //System.out.println("Here are list of available Courses:");
        int courseid = -1;
        while (rs.next()) {
            courseid = (rs.getInt("id"));
            //System.out.println(courseid+"c");
        }
        sql = SQLQueriesConstants.VIEW_STUDENT_LIST_STUDENTID;
        PreparedStatement statement2=connection.prepareStatement(sql);
        statement2.setInt(1,courseid);
        rs = statement2.executeQuery();
        int studid = -1;
        String studname = "datta";
        System.out.println("StudentID : StudentName");
        while (rs.next()){
            studid = rs.getInt("student_id");
            //System.out.println(studid+"hi");
            String sql2 = SQLQueriesConstants.VIEW_STUDENT_LIST_STUDENTNAME;
            PreparedStatement statement3=connection.prepareStatement(sql2);
            statement3.setInt(1,studid);
            ResultSet rs2 = statement3.executeQuery();
            while (rs2.next()){
                studname = rs2.getString("name");
            }
            System.out.println(studid+"     "+studname);
        }
    }

    @Override
    public void assignGrade(int id) throws SQLException {
        Connection connection = DBConnection.getConnection();
        String sql = SQLQueriesConstants.VIEW_STUDENT_LIST_COURSEID;
        statement=connection.prepareStatement(sql);
        statement.setInt(1,id);
        ResultSet rs = statement.executeQuery();
        //System.out.println("Here are list of available Courses:");
        int courseid = -1;
        while (rs.next()) {
            courseid = (rs.getInt("id"));
            //System.out.println(courseid+"c");
        }
        sql = SQLQueriesConstants.VIEW_STUDENT_LIST_STUDENTID;
        PreparedStatement statement2=connection.prepareStatement(sql);
        statement2.setInt(1,courseid);
        rs = statement2.executeQuery();
        int studid = -1;
        String studname = "datta";
        System.out.println("StudentID : StudentName");
        while (rs.next()){
            studid = rs.getInt("student_id");
            //System.out.println(studid+"hi");
            String sql2 = SQLQueriesConstants.VIEW_STUDENT_LIST_STUDENTNAME;
            PreparedStatement statement3=connection.prepareStatement(sql2);
            statement3.setInt(1,studid);
            ResultSet rs2 = statement3.executeQuery();
            while (rs2.next()){
                studname = rs2.getString("name");
            }
            System.out.println(studid+"     "+studname);
            System.out.print("Enter Grade- ");
            Scanner sc = new Scanner(System.in);
            String grade = sc.nextLine();

            String sql3 = SQLQueriesConstants.GIVE_GRADE;
            PreparedStatement statement4=connection.prepareStatement(sql3);
            statement4.setString(1,grade);
            statement4.setInt(2,courseid);
            statement4.setInt(3,studid);
            statement4.executeUpdate();
        }

    }
}
