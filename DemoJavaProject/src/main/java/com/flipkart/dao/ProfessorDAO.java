package com.flipkart.dao;

import com.flipkart.bean.*;
import com.flipkart.entity.GenericResponse;
import com.flipkart.entity.StudentListEntity;
import com.flipkart.exceptions.*;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ProfessorDAO {

    GenericResponse chooseCourse(int id, int courseid) throws SQLException, CourseNotAssignedToProfException, CourseAlreadyTakenException, CourseAlreadyAssignedException;

    Professor fetchProfessorData(int id) throws SQLException, UserNotFoundException;

    ArrayList<StudentListEntity> viewStudentsList (int id) throws SQLException, NoStudentRegisteredException;

    GenericResponse assignGrade(int id, String grade) throws SQLException, GradeNotAddedException,NoStudentRegisteredException;

}
