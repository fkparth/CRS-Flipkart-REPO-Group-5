package com.flipkart.service;
import com.flipkart.bean.*;
public interface AdminInterface {
    Admin fetchUserData(int id);
    void approveStudent();

    void generateReportCard();

    void addProfessor();

    void updateCatalogue(Course course);

    void assignCourseToStudent();
}
