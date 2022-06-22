package com.flipkart.dao;

import com.flipkart.bean.*;

public interface ProfessorDAO {

    void chooseCourse(int id);

    Professor fetchProfessorData(int id);

    void viewStudentsList(int id);

    void assignGrade(int id);

}
