package de.kilobyte22.voc.api.auth;

public class PermissionException extends Exception {
    public PermissionException() {
        this("You do not have the right to do this");
    }

    public PermissionException(String s) {
        super(s);
    }
}
