package com.flipkart.exceptions;

public class PaymentAlreadyExistsException extends Exception {
    @Override
    public String getMessage() {
        return "Fee already paid.";
    }
}
