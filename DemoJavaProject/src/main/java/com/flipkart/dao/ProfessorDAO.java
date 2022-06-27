package com.flipkart.dao;

import com.flipkart.bean.*;
import com.flipkart.entity.GenericResponse;
import com.flipkart.entity.StudentListEntity;
import com.flipkart.exceptions.CourseNotAssignedToProfException;
import com.flipkart.exceptions.GradeNotAddedException;
import com.flipkart.exceptions.NoStudentRegisteredException;
import com.flipkart.exceptions.UserNotFoundException;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ProfessorDAO {

    GenericResponse chooseCourse(int id, int courseid) throws SQLException, CourseNotAssignedToProfException;

    Professor fetchProfessorData(int id) throws SQLException, UserNotFoundException;

    ArrayList<StudentListEntity> viewStudentsList (int id) throws SQLException, NoStudentRegisteredException;

    GenericResponse assignGrade(int id, String grade,int studId) throws SQLException, GradeNotAddedException,NoStudentRegisteredException;

}
