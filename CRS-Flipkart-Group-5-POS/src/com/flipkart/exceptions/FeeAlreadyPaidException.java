package com.flipkart.exceptions;

public class FeeAlreadyPaidException extends Exception {
    @Override
    public String getMessage() {
        return "Fee already paid.";
    }
}
