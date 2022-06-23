package com.flipkart.exceptions;

public class CourseNotFoundException extends Exception{
    private int courseId;

    public CourseNotFoundException(int courseId) {
        this.courseId = courseId;
    }

    public int getCourseId() {
        return courseId;
    }

    @Override
    public String getMessage() {
        return "Course with ID: " + courseId + "not found";
    }
}
