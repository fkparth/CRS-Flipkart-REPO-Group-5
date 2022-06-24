package com.flipkart.exceptions;

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
<<<<<<< HEAD

=======
>>>>>>> 99306809c05828d02a7c1feb3bbb8735ec77d06e
    }
}
