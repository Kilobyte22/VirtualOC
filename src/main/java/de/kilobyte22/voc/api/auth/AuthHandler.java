package de.kilobyte22.voc.api.auth;

public interface AuthHandler {
    boolean canRegister();

    void register(String username, String email, String password) throws AuthException;
    void login(String username, String password) throws AuthException;


}
