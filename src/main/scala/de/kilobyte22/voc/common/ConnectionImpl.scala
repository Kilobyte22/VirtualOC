package de.kilobyte22.voc.common

import de.kilobyte22.voc.api.common.networking.Connection
import de.kilobyte22.voc.api.common.encryption.EncryptionLayer

class ConnectionImpl extends Connection {

  var encryptionLayer: EncryptionLayer = null
}
