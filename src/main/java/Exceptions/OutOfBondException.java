package Exceptions;

public class OutOfBondException extends RuntimeException {
    public OutOfBondException (String message){
        super(message);
    }
}
