package de.kilobyte22.voc.api.auth;

public interface CommandSender {
    boolean hasPermission(String permission);
    boolean hasPermission(String permission, Permissible object);

    String getDisplayName();
}
