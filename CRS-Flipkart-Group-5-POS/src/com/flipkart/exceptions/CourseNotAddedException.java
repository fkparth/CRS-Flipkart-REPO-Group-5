package com.flipkart.exceptions;

//course could not be added  (used by student)
public class CourseNotAddedException extends Exception{


    @Override
    public String getMessage() {
        return "Course has not been added";
    }
}
