package Exceptions;

public class EmptyArgumentException extends RuntimeException {
    public EmptyArgumentException(String message) {
        super(message);
    }
}