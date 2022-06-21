package com.flipkart.service;

import com.flipkart.Dao.MockData;
import com.flipkart.bean.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProfessorImplementation implements ProfessorInterface{
    @Override
    public Professor fetchProfessorData(int id) {


        MockData data = MockData.getInstance();
        return data.professor.get(id);
    }
    @Override
    public void chooseCourse() {



    }

    @Override
    public void viewStudentsList() {

    }

    @Override
    public void assignGrade() {

    }
}
