package com.tylerswift.sp500tracker.exception;

public class NullFileNameException extends RuntimeException {
    public NullFileNameException(String message) {
        super(message);
    }
}
