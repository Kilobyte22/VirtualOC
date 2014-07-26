package de.kilobyte22.voc.api.common

import de.kilobyte22.voc.api.common.encryption.EncryptionLayerFactory

trait CommonCore {
  def registerEncryptionLayer(name: String, factory: EncryptionLayerFactory[_]) = ???
}

object Core {
  var core: CommonCore = null
}