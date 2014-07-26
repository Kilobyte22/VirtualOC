package de.kilobyte22.voc.api.common.encryption

import java.io.Closeable

trait EncryptionLayer extends Closeable {
  def sendPacket(data: Array[Byte])

  def receivePacket: Array[Byte]
}