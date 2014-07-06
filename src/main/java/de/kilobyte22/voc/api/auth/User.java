package de.kilobyte22.voc.api.auth;

import com.sun.istack.internal.Nullable;

public interface User extends CommandSender {
    String getUsername();
    String getEmail(); // IDFK who would need this, but eh

    boolean isConnected();

    void setDisplayName(String name) throws PermissionException;
    void kick(@Nullable String reason) throws PermissionException;
    void delete() throws PermissionException;

}
