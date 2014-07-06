package de.kilobyte22.voc.api.auth;

public class AuthException extends Exception {
    private final ExceptionType type;

    public AuthException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }

    public ExceptionType getType() {
        return type;
    }

    public enum ExceptionType {
        EXISTS, // account exists
        FAILED, // user/password missmatch

     }
}
