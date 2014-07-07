package de.kilobyte22.voc.common.encryption

import de.kilobyte22.voc.api.common.encryption.EncryptionLayer
import de.kilobyte22.voc.api.common.networking.BidirectionalDataStream

class PlainEncryptionLayer(stream: BidirectionalDataStream) extends EncryptionLayer {
  override def close(): Unit = ???

  override def receivePacket(): Array[Byte] = ???

  override def sendPacket(data: Array[Byte]): Unit = ???
}
