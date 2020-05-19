package com.codegym.services;

public class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Error while performing calculation: " + super.getMessage();
    }
}
