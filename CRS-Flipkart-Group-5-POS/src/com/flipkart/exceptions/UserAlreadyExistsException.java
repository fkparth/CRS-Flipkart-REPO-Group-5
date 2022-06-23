package com.flipkart.exceptions;

public class UserAlreadyExistsException {
    private int userId;

    public UserAlreadyExistsException(int userId)
    {
        this.userId=userId;
    }

    public int getStudentId()
    {
        return userId;
    }


    public String getMessage() {
        return "User with userId : " + userId +" already exists";
    }
}
