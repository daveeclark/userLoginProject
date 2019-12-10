package com.userLoginAuth.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


//ResponseStatus - Marks a method or exception class with the
// status code() and reason() that should be returned.

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    //serialVersionUID - is used during deserialization to verify
    // that the sender and receiver of a serialized object have
    // loaded classes for that object that are compatible with respect to serialization


    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException() {}

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }



}
