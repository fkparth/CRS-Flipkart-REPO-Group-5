package com.flipkart.service;
import java.util.*;

import com.flipkart.Dao.MockData;
import com.flipkart.bean.RegisteredCourse;
import com.flipkart.bean.Student;
public class StudentImplementation implements StudentInterface {

    @Override
    public void register() {

    }

    @Override
    public List<RegisteredCourse> registeredCourses() {
        return null;
    }

    @Override
    public void addCourses() {

    }

    @Override
    public void dropCourses() {

    }

    @Override
    public void feePayment() {

    }

    @Override
    public void viewCourses() {

    }

    @Override
    public Student fetchStudentData(int id) {

        MockData data = MockData.getInstance();
        return data.student.get(id);






    }

    @Override
    public void viewGradesheet() {

    }

    @Override
    public void viewGradeCatalogue() {

    }
}
