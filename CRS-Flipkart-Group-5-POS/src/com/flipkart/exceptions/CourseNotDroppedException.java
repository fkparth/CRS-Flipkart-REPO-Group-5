package com.flipkart.exceptions;

public class CourseNotDroppedException extends Exception {
    @Override
    public String getMessage() {
        return "Course has not been added";
    }
}
