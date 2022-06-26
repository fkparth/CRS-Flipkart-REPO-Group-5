package com.flipkart.dao;

import com.flipkart.bean.*;
import com.flipkart.exceptions.CourseNotAssignedToProfException;
import com.flipkart.exceptions.GradeNotAddedException;
import com.flipkart.exceptions.NoStudentRegisteredException;
import com.flipkart.exceptions.UserNotFoundException;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ProfessorDAO {

    ArrayList<String> chooseCourse(int id) throws SQLException, CourseNotAssignedToProfException;

    Professor fetchProfessorData(int id) throws SQLException, UserNotFoundException;

    void viewStudentsList (int id) throws SQLException, NoStudentRegisteredException;

    void assignGrade(int id) throws SQLException, GradeNotAddedException,NoStudentRegisteredException;

}
