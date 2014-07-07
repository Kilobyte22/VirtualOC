package de.kilobyte22.voc.api.common.encryption;

import de.kilobyte22.voc.api.common.networking.BidirectionalDataStream;

public interface EncryptionLayerFactory<T extends EncryptionLayer> {
    T create(BidirectionalDataStream stream);
}
