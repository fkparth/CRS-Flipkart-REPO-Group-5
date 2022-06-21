package com.flipkart.bean;

import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    public int studentId;

    public List<RegisteredCourse> registeredCourses = new ArrayList<RegisteredCourse>();

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public List<RegisteredCourse> getRegisteredCourses() {
        return registeredCourses;
    }

    public void addRegisteredCourses(RegisteredCourse regcourse) {
        this.registeredCourses.add(regcourse);
    }
}
