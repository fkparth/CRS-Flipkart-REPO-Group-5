package com.flipkart.dao;

import com.flipkart.bean.Admin;
import com.flipkart.exceptions.*;

import java.sql.SQLException;

public interface AdminDAO {
    Admin fetchAdminData(int id) throws SQLException, UserNotFoundException;
    void approveStudent() throws SQLException;

    void generateReportCard();

    void addProfessor() throws SQLException, UserAlreadyExistsException;

    void updateCatalogue(int addOrDrop , int courseId , String courseName) throws SQLException, CourseAlreadyExistsException, CourseNotFoundException;

    void assignCourseToStudent();

    void viewCourseCatalogue() throws SQLException;
}
