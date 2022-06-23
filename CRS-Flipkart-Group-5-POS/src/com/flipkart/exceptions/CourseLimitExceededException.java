package com.flipkart.exceptions;

<<<<<<< HEAD
public class CourseLimitExceededException extends Exception {
    @Override
    public String getMessage() {
        return "Course limit exceeced.";
=======
//course has reached maximum strength limit of 10
public class CourseLimitExceededException extends Exception{
    private int num=10;
    public CourseLimitExceededException(int num ) {
        this.num = num;
    }

    @Override
    public String getMessage()
    {
        return "You have already registered for " + num + " courses";
>>>>>>> bf746eebbe1e6ae29efe60faead0652e75e4d3d1
    }
}
