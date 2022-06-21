package com.flipkart.service;

import com.flipkart.bean.*;

import java.util.List;

public interface RegistrationInterface {
    void viewCourses();

    void registeredCourses(Student student);

    void addCourse(Student student);

    void dropCourse(Student student);

    void feePayment();
}
