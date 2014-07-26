package de.kilobyte22.voc.api.client

import de.kilobyte22.voc.api.auth.AuthHandler
import de.kilobyte22.voc.api.common.encryption.EncryptionLayer

abstract trait Server {
  def authHandler: AuthHandler

  def displayName: String

  def displayName_=(name: String)

  def encryptionLayer: EncryptionLayer
}