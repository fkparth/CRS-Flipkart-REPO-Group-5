package com.flipkart.dao;

import com.flipkart.bean.*;

public interface StudentDAO {
    void register(Student stud);

    public Student fetchStudentData(int id);

    //show gradesheet(print inside the function not return it)
    void viewGradesheet();

    //same goes with this function we show the course catalogue print it not return it
    void viewCourseCatalogue();

    void addCourses(Student stud);

    void dropCourses(Student stud);

    void feePayment();

    void viewCourses(Student stud);
}
