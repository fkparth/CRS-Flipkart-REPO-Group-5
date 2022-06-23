package com.flipkart.exceptions;

//course not assigned to professor
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
        return "Course  not assigned to the professor";
    }
}
