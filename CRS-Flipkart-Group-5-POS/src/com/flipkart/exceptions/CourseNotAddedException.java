package com.flipkart.exceptions;

public class CourseNotAddedException extends Exception{
    private int courseId;

    public CourseNotAddedException(int courseId) {
        this.courseId = courseId;
    }

    public int getCourseId() {
        return courseId;
    }

    @Override
    public String getMessage() {
        return "Course with ID: " + courseId + "has not been added";
    }
}
