package com.flipkart.dao;

import com.flipkart.bean.*;
import com.flipkart.exceptions.*;

import java.sql.SQLException;

public interface StudentDAO {
    void register(Student stud) throws SQLException, RegistrationUnsuccessfulException;

    public Student fetchStudentData(int id) throws SQLException, UserNotFoundException;

    //show gradesheet(print inside the function not return it)
    void viewGradesheet(int userId) throws SQLException, NoRegisteredCoursesException;

    //same goes with this function we show the course catalogue print it not return it
    void viewCourseCatalogue() throws SQLException;

    void addCourses(Student stud) throws SQLException, CourseNotAddedException;

    void dropCourses(Student stud) throws SQLException, CourseNotDroppedException;

    void feePayment(Student student) throws SQLException, PaymentUnsuccessfulException;

    void viewCourses(int stud) throws SQLException, NoRegisteredCoursesException;
}
