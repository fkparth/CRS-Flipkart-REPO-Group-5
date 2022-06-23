package com.flipkart.exceptions;

//grade not assigned by professor
public class GradeNotAddedException extends Exception{

    @Override
    public String getMessage() {
        return "Grades not assigned";
    }
}
