package com.flipkart.service;

import com.flipkart.bean.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProfessorImplementation implements ProfessorInterface{
    @Override
    public Professor FetchUserData(int id) {

        HashMap<Integer,Professor> stuData = new HashMap<Integer,Professor>();
        Professor s1 = new Professor();

        s1.setName("Datta");
        s1.setRole(2);
        s1.setUserId(201);
        stuData.put(201,s1);
        Professor s2 = new Professor();

        s2.setName("Arbab");
        s2.setRole(2);
        s2.setUserId(202);
        stuData.put(202,s2);
        return stuData.get(id);
    }
    @Override
    public void chooseCourse() {
        List<Course> courseList = new ArrayList<Course>();


    }

    @Override
    public void viewStudentsList() {

    }

    @Override
    public void assignGrade() {

    }
}
