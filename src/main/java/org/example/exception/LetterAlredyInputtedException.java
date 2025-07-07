package org.example.exception;

public class LetterAlredyInputtedException extends RuntimeException {
    public LetterAlredyInputtedException(String message) {
        super(message);
    }
}
