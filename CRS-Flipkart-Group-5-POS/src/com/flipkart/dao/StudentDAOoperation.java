package com.flipkart.dao;

import com.flipkart.bean.*;
import com.flipkart.constants.SQLQueriesConstants;
import com.flipkart.utils.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAOoperation implements StudentDAO{
    private PreparedStatement statement = null;
    @Override
    public void register(Student stud) {

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
    public void viewCourseCatalogue() {

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
