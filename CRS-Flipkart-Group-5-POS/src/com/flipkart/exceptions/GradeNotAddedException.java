package com.flipkart.exceptions;

public class GradeNotAddedException extends Exception{
    private int studentId;

    public GradeNotAddedException(int studentId)
    {
        this.studentId=studentId;
    }

    public int getStudentId()
    {
        return studentId;
    }

    @Override
    public String getMessage() {
        return "Grades not assigned for: " + studentId;
    }
}
