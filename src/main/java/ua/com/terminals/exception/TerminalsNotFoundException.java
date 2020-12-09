package ua.com.terminals.exception;

public class TerminalsNotFoundException extends RuntimeException {
    public TerminalsNotFoundException(String message) {
        super(message);
    }
}
