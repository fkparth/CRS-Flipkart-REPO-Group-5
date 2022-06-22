package com.flipkart.dao;

import com.flipkart.bean.*;

import java.sql.SQLException;

public interface StudentDAO {
    void register(Student stud) throws SQLException;

    public Student fetchStudentData(int id) throws SQLException;

    //show gradesheet(print inside the function not return it)
    void viewGradesheet(int userId) throws SQLException;

    //same goes with this function we show the course catalogue print it not return it
    void viewCourseCatalogue() throws SQLException;

    void addCourses(Student stud);

    void dropCourses(Student stud);

    void feePayment();

    void viewCourses(int stud) throws SQLException;
}
