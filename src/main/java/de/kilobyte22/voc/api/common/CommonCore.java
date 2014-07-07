package de.kilobyte22.voc.api.common;

import de.kilobyte22.voc.api.common.encryption.EncryptionLayerFactory;

public interface CommonCore {
    void registerEncryptionLayer(String name, EncryptionLayerFactory factory);
}
