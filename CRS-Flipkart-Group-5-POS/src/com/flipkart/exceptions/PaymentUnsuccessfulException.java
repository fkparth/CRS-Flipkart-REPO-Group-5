package com.flipkart.exceptions;

public class PaymentUnsuccessfulException {
    private int studentId;

    public PaymentUnsuccessfulException(int studentId)
    {
        this.studentId=studentId;
    }

    public int getStudentId()
    {
        return studentId;
    }


    public String getMessage() {
        return "Payment unsuccessful for : " + studentId;
    }
}
