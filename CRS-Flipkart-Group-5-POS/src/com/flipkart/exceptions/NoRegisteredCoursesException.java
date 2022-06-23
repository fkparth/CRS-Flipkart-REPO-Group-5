package com.flipkart.exceptions;

public class NoRegisteredCoursesException {
    private int studentId;

    public NoRegisteredCoursesException(int studentId)
    {
        this.studentId=studentId;
    }

    public int getStudentId()
    {
        return studentId;
    }


    public String getMessage() {
        return "No courses registered for: " + studentId;
    }
}
