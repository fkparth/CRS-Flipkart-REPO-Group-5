package com.flipkart.service;
import java.util.*;

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

          HashMap<Integer,Student>     stuData = new HashMap<Integer,Student>();
          Student s1 = new Student();
          s1.setStudentId(101);
          s1.setName("Datta");
          s1.setRole(1);
          s1.setUserId(101);
          stuData.put(101,s1);
        Student s2 = new Student();
        s2.setStudentId(102);
        s2.setName("Rohit");
        s2.setRole(1);
        s2.setUserId(102);
         stuData.put(102,s2);
         return stuData.get(id);






    }

    @Override
    public void viewGradesheet() {

    }

    @Override
    public void viewGradeCatalogue() {

    }
}
