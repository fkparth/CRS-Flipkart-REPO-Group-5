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
        course1.setCourseName("POIS");
        course1.setStatus(1);
        Course course2 = new Course();
        course1.setCourseId(2);
        course1.setCourseName("OS");
        course1.setStatus(1);
        Course course3 = new Course();
        course1.setCourseId(3);
        course1.setCourseName("DSA");
        course1.setStatus(1);
        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);


        return courseList;
    }
}
