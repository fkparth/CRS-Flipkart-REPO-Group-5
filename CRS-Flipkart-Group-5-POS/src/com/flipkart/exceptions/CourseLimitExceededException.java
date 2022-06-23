package com.flipkart.exceptions;

public class CourseLimitExceededException extends Exception{
    private int num=10;
    public CourseLimitExceededException(int num ) {
        this.num = num;
    }

    @Override
    public String getMessage()
    {
        return "You have already registered for " + num + " courses";
    }
}
