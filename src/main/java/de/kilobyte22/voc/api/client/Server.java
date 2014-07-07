package de.kilobyte22.voc.api.client;

import de.kilobyte22.voc.api.auth.AuthHandler;
import de.kilobyte22.voc.api.auth.PermissionException;
import de.kilobyte22.voc.api.common.encryption.EncryptionLayer;

public interface Server {
    AuthHandler getAuthHandler();
    String getDisplayName();

    void setDisplayName(String name) throws PermissionException;
    EncryptionLayer getEncryptionLayer();
}
