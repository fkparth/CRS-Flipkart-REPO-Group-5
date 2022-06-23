package com.flipkart.exceptions;

public class CourseAlreadyExistsException extends Exception {
    /**
     * Message returned when exception is thrown
     */
    @Override
    public String getMessage() {
        return "Course already exists.";
    }
}
