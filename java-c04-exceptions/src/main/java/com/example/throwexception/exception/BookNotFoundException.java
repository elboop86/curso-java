package com.example.throwexception.exception;

// NO comprobada
public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String message) {
        super(message);
    }
}
