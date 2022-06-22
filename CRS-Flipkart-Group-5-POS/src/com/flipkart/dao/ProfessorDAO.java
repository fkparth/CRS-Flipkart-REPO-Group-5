package com.flipkart.dao;

import com.flipkart.bean.*;

import java.sql.SQLException;

public interface ProfessorDAO {

    void chooseCourse(int id) throws SQLException;

    Professor fetchProfessorData(int id) throws SQLException;

    void viewStudentsList (int id) throws SQLException;

    void assignGrade(int id);

}
