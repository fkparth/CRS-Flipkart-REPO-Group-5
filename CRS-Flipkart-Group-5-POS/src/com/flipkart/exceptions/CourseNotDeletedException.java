package com.flipkart.exceptions;

public class CourseNotDeletedException extends Exception{
    private int courseId;

    public CourseNotDeletedException(int courseId) {
        this.courseId = courseId;
    }

    public int getCourseId() {
        return courseId;
    }

    @Override
    public String getMessage() {
        return "Course with ID: " + courseId + "has not been deleted";
    }
}
