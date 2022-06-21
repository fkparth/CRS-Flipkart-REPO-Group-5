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
        course1.setStatus("Active");
        Course course2 = new Course();
        course2.setCourseId(2);
        course2.setCourseName("OS");
        course2.setStatus("Active");
        Course course3 = new Course();
        course3.setCourseId(3);
        course3.setCourseName("DSA");
        course3.setStatus("Active");
        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);


        return courseList;
    }
}
