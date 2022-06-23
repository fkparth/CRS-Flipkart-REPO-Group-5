package com.flipkart.exceptions;

public class FeePaymentException extends Exception {
    @Override
    public String getMessage() {
        return "Error in paying fee.";
    }
}
