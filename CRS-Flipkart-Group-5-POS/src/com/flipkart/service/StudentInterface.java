package com.flipkart.service;
import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.List;
import com.flipkart.bean.*;
public interface StudentInterface {
    void register();

    public Student FetchUserData(int id);

    //show gradesheet(print inside the function not return it)
    void viewGradesheet();

    //same goes with this function we show the grades print it not return it
    void viewGradeCatalogue();
    List<RegisteredCourse> registeredCourses();

    void addCourses();

    void dropCourses();

    void feePayment();

    void viewCourses();
}


