package com.flipkart.exceptions;

public class CourseAlreadyExistsException extends Exception{
    private int courseId;

    public CourseAlreadyExistsException(int courseId) {
        this.courseId = courseId;
    }

    public int getCourseId() {
        return courseId;
    }

    @Override
    public String getMessage() {
        return "The course with ID: " + courseId + "already exists";
    }
}
