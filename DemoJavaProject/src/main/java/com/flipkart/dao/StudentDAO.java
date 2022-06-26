package com.flipkart.dao;

import com.flipkart.bean.*;
import com.flipkart.entity.StudentViewCourseEntity;
import com.flipkart.entity.StudentViewGradesheetEntity;
import com.flipkart.exceptions.*;

import java.sql.SQLException;
import java.util.ArrayList;

public interface StudentDAO {
    //method to register student for a new course
    //@throws RegistrationUnsuccessfulException
    /**
     * Method to register student in a course from database
     * @param stud: student object containing all the fields
     * @throws RegistrationUnsuccessfulException
     */
    void register(int stud, ArrayList<Integer> preference) throws SQLException, RegistrationUnsuccessfulException;

    /**
     * Method to fetch student data from database
     * @param id: student id
     * @return student object containing all the fields
     * @throws UserNotFoundException
     */
    public Student fetchStudentData(int id) throws SQLException, UserNotFoundException;

    //show gradesheet(print inside the function not return it)
//    /**
//     * Method to view gradesheet after grade assigned by the professor
//     * @param id: student id
//     * @return
//     * @throws NoRegisteredCoursesException
//     */
    ArrayList<StudentViewGradesheetEntity> viewGradesheet(int userId) throws SQLException, NoRegisteredCoursesException;

    //same goes with this function we show the course catalogue print it not return it
    /**
     * Method to view course course catalogue
     * @return returns Coursecatalogue
     * @throws SQLException
     */
    void viewCourseCatalogue() throws SQLException;

    /**
     * method to add course in database from course catalogue
     * @param stdid: student object containing all fields
     * @param courseid: id of the course being added
     * @throws CourseNotAddedException
     */
    void addCourses(int stdid,int courseid) throws SQLException, CourseNotAddedException;


    /**
     * method to drop course selected by student
     * @param stdid: student object containing all fields
     * @param courseid: id of the course being added
     * @throws CourseNotDroppedException
     */
    void dropCourses(int stdid,int courseid) throws SQLException, CourseNotDroppedException,CourseNotFoundException;


    /**
     * method to pay fee by student for the selected course from database
     * @param student: student object containing all fields
     * @throws PaymentUnsuccessfulException
     */


    /**
     * method to view selected course list
     *
     * @param stud: student object containing all fields
     * @return ArrayList of courses student has registered
     * @throws NoRegisteredCoursesException
     */
    ArrayList<StudentViewCourseEntity> viewCourses(int stud) throws SQLException, NoRegisteredCoursesException;

    void feePayment(int id, int paymentMode) throws SQLException, PaymentUnsuccessfulException;
}
