package com.flipkart.exceptions;

public class UserNotFoundException {
    private int userId;

    public UserNotFoundException(int userId)
    {
        this.userId=userId;
    }

    public int getStudentId()
    {
        return userId;
    }


    public String getMessage() {
        return "User with userId : " + userId +" not found";
    }
}
