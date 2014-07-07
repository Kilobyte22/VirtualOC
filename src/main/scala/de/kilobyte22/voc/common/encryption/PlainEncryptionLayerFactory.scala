package de.kilobyte22.voc.common.encryption

import de.kilobyte22.voc.api.common.encryption.EncryptionLayerFactory
import de.kilobyte22.voc.api.common.networking.BidirectionalDataStream

object PlainEncryptionLayerFactory extends EncryptionLayerFactory[PlainEncryptionLayer] {
  override def create(stream: BidirectionalDataStream) = {
    Console.err.println("ALL HOPE IS LOST. UNENCRYPTED CONNECTION! RUN FOR YOUR LIFE")
    new PlainEncryptionLayer(stream)
  }
}
