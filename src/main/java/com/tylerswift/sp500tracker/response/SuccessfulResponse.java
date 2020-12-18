package com.tylerswift.sp500tracker.response;

public class SuccessfulResponse {

    private String filename;
    private String message;

    public SuccessfulResponse(String filename, String message) {
        this.filename = filename;
        this.message = message;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
