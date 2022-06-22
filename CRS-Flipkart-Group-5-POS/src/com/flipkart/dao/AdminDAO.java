package com.flipkart.dao;

import com.flipkart.bean.Admin;

import java.sql.SQLException;

public interface AdminDAO {
    Admin fetchAdminData(int id) throws SQLException;
    void approveStudent() throws SQLException;

    void generateReportCard();

    void addProfessor() throws SQLException;

    void updateCatalogue(int addOrDrop) throws SQLException;

    void assignCourseToStudent();
}
