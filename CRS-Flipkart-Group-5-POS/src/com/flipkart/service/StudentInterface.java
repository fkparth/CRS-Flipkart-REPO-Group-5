package com.flipkart.service;

import com.flipkart.bean.RegisteredCourse;
import com.flipkart.bean.Student;

import java.util.List;
public interface StudentInterface {
    void register();

    public Student fetchStudentData(int id);

    //show gradesheet(print inside the function not return it)
    void viewGradesheet();

    //same goes with this function we show the grades print it not return it

    void viewCourseCatalogue();

    void viewGradeCatalogue();
    List<RegisteredCourse> registeredCourses();

    void addCourses();

    void dropCourses();

    void feePayment();

    void viewCourses();

}


