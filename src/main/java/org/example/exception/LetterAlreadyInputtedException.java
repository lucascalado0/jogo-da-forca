package org.example.exception;

public class LetterAlreadyInputtedException extends RuntimeException {
    public LetterAlreadyInputtedException(String message) {
        super(message);
    }
}
