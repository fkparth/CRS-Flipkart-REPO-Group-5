package com.flipkart.exceptions;

public class CourseNotAssignedToProfException extends Exception{
    private int courseId;

    public CourseNotAssignedToProfException(int courseId) {
        this.courseId = courseId;
    }

    public int getCourseId() {
        return courseId;
    }

    @Override
    public String getMessage() {
        return "Course with ID: " + courseId + "not assigned to the professor";
    }
}
