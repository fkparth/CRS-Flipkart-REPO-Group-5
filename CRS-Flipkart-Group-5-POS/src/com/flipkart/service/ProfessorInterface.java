package com.flipkart.service;
import com.flipkart.bean.*;
public interface ProfessorInterface {
    void chooseCourse();
    Professor fetchProfessorData(int id);

    void viewStudentsList();

    void assignGrade();

}
