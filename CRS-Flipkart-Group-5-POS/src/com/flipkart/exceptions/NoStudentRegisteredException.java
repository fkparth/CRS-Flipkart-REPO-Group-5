package com.flipkart.exceptions;

public class NoStudentRegisteredException extends Exception{
    private int courseId;

    public NoStudentRegisteredException(int courseId) {
        this.courseId = courseId;
    }

    public int getCourseId() {
        return courseId;
    }

    @Override
    public String getMessage() {
        return "No student registered for Course with ID: " + courseId ;
    }
}
