package com.flipkart.exceptions;

//registration of student unsucessful
public class RegistrationUnsuccessfulException extends Exception{
    private int studentId;

    public RegistrationUnsuccessfulException(int studentId)
    {
        this.studentId=studentId;
    }

    public int getStudentId()
    {
        return studentId;
    }

    @Override
    public String getMessage() {
        return "Registration unsuccessful for : " + studentId;
    }
}
