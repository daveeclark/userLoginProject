package com.userLoginAuth.model.error;



public class SimpleResponse {

    private int code;
    private String message;

    public SimpleResponse() {
    }

    public SimpleResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static SimpleResponse Create(String message, int code) {
        return new SimpleResponse(code, message);
    }

}
