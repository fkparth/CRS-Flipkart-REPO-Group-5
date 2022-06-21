package com.flipkart.service;

import java.util.*;
import com.flipkart.bean.*;

public class RegistrationImplementation implements RegistrationInterface {

    @Override
    public void viewCourses(){
        CourseCatalogInterface cci = new CourseCatalogImplementation();
        List<Course> lc = cci.fetchCoursesList();
        System.out.println("CourseId  :  Course Name");
        for (Course course : lc) {
            if(course.status==1){
                System.out.println(course.courseId+"  :  "+course.courseName);
            }
        }
    }

    @Override
    public void registeredCourses(Student student){
        System.out.println("CourseId");
        for (RegisteredCourse course : student.registeredCourses) {
            System.out.println(course.courseId);
        }
    }

    @Override
    public void addCourse(Student student){
        RegisteredCourse rc= new RegisteredCourse();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CourseId to add");
        int rcId = sc.nextInt();
        rc.setCourseId(rcId);
        rc.setStudentId(student.getStudentId());
        student.addRegisteredCourses(rc);
    }

    @Override
    public void dropCourse(Student student){
        RegisteredCourse rc = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CourseId to drop");
        int rcId = sc.nextInt();
        for (RegisteredCourse course : student.registeredCourses) {
            if(course.courseId == rcId){
                rc = course;
            }
        }
        student.registeredCourses.remove(rc);
    }

    @Override
    public void feePayment(){

    }
}
