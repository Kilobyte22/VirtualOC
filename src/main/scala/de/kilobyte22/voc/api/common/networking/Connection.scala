package de.kilobyte22.voc.api.common.networking

import de.kilobyte22.voc.api.common.encryption.EncryptionLayer

trait Connection {
  def encryptionLayer: EncryptionLayer
}