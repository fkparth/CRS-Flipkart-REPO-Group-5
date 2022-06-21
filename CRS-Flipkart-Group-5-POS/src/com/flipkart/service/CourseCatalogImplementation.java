package com.flipkart.service;

import com.flipkart.bean.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseCatalogImplementation implements CourseCatalogInterface {
    @Override
    public List<Course> fetchCoursesList() {
        List<Course> courseList = new ArrayList<Course>();
        Course course1 = new Course();
        course1.setCourseId(1);
        course1.setCourseName("Course#1");
        course1.setStatus(1);
        Course course2 = new Course();
        course2.setCourseId(2);
        course2.setCourseName("Course#2");
        course2.setStatus(1);
        Course course3 = new Course();
        course3.setCourseId(3);
        course3.setCourseName("Course#3");
        course3.setStatus(1);
        Course course4 = new Course();
        course4.setCourseId(4);
        course4.setCourseName("Course#4");
        course4.setStatus(1);
        Course course5 = new Course();
        course5.setCourseId(5);
        course5.setCourseName("Course#5");
        course5.setStatus(1);
        Course course6 = new Course();
        course6.setCourseId(6);
        course6.setCourseName("Course#6");
        course6.setStatus(1);
        Course course7 = new Course();
        course7.setCourseId(7);
        course7.setCourseName("Course#7");
        course7.setStatus(1);
        Course course8 = new Course();
        course8.setCourseId(8);
        course8.setCourseName("Course#8");
        course8.setStatus(1);
        Course course9 = new Course();
        course9.setCourseId(9);
        course9.setCourseName("Course#9");
        course9.setStatus(1);

        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);
        courseList.add(course4);
        courseList.add(course5);
        courseList.add(course6);
        courseList.add(course7);
        courseList.add(course8);
        courseList.add(course9);


        return courseList;
    }
}
