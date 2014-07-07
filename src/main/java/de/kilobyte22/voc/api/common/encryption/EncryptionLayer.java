package de.kilobyte22.voc.api.common.encryption;

import java.io.Closeable;

public interface EncryptionLayer extends Closeable {
    void sendPacket(byte[] data);
    byte[] receivePacket();
}
