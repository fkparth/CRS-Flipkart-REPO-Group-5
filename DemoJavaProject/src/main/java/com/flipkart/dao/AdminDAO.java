package com.flipkart.dao;

import com.flipkart.bean.Admin;
import com.flipkart.entity.CourseCatalogEntity;
import com.flipkart.exceptions.*;
import javafx.util.Pair;

import java.sql.SQLException;
import java.util.ArrayList;

public interface AdminDAO {
    Admin fetchAdminData(int id) throws SQLException, UserNotFoundException;

    ArrayList<Integer> approveStudentsList() throws SQLException;


    void approveStudent(ArrayList<Integer> list) throws SQLException;

    void generateReportCard();

    void addProfessor(int profid, String pass, String profname, int profrole, int depid) throws SQLException, UserAlreadyExistsException;

    void updateCatalogue(int addOrDrop , int courseId , String courseName) throws SQLException, CourseAlreadyExistsException, CourseNotFoundException;

    void assignCourseToStudent();

    ArrayList<CourseCatalogEntity> viewCourseCatalogue() throws SQLException;
}
