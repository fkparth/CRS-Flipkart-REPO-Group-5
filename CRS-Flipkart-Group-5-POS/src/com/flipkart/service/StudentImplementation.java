package com.flipkart.service;

import java.util.*;
import com.flipkart.application.RegistrationCRSMenu;
import com.flipkart.bean.*;

public class StudentImplementation implements StudentInterface {
    @Override
    public Student FetchUserData(int id) {
        HashMap<Integer,Student> stuData = new HashMap<Integer,Student>();
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
    public void register(Student student) {
        RegistrationCRSMenu r = new RegistrationCRSMenu();
        r.showChoices(student);
    }

    @Override
    public void viewRegisteredCourses(Student student){
        System.out.println("CourseId");
        for (RegisteredCourse course : student.registeredCourses) {
            System.out.println(course.courseId);
        }
    }

    @Override
    public void viewGradesheet(Student student) {
        System.out.println("CourseId  :  Grade");
        for (RegisteredCourse course : student.registeredCourses) {
            System.out.println(course.courseId+"  :  "+course.getGrade());
        }
    }
}
