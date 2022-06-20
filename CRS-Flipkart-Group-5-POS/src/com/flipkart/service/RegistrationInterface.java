package com.flipkart.service;

import com.flipkart.bean.RegisteredCourse;

import java.util.List;

public class RegistrationInterface {
    public List<RegisteredCourse> registeredCourses();

    public void addCourses();

    public void dropCourses();

    public void feePayment();

    public void viewCourses();
}

