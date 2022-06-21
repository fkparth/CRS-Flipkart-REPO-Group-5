package com.flipkart.service;
import java.util.*;

import com.flipkart.Dao.MockData;
import com.flipkart.bean.RegisteredCourse;
import com.flipkart.bean.*;
public class StudentImplementation implements StudentInterface {

    @Override
    public void register() {

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
        return ;

    }

    @Override
    public void viewCourseCatalogue() {
        MockData data = MockData.getInstance();
        System.out.println("CourseID : CourseName");
        for (Course iter: data.course.values()){
            System.out.print(iter.getCourseId()+" ");
            System.out.println(iter.getCourseName());
        }
        return ;
    }
}
