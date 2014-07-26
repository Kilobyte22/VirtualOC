package de.kilobyte22.voc.client

import de.kilobyte22.voc.api.client.Server
import de.kilobyte22.voc.api.auth.AuthHandler
import de.kilobyte22.voc.api.common.encryption.EncryptionLayer

class ServerImpl extends Server {

  var displayName: String = null
  var authHandler: AuthHandler = null
  var encryptionLayer: EncryptionLayer = null

  override def displayName_=(name: String) {
    // todo: send packet
  }
}
