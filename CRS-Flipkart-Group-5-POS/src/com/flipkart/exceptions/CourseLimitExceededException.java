package com.flipkart.exceptions;

public class CourseLimitExceededException extends Exception {
    @Override
    public String getMessage() {
        return "Course limit exceeced.";
    }
}
