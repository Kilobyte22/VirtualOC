package de.kilobyte22.voc.api.common

import de.kilobyte22.voc.api.common.encryption.EncryptionLayerFactory

object CommonCore {
  def registerEncryptionLayer(name: String, factory: EncryptionLayerFactory[_]) = ???
}