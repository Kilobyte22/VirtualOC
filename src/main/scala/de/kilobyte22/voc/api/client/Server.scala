package de.kilobyte22.voc.api.client

import de.kilobyte22.voc.api.auth.AuthHandler
import de.kilobyte22.voc.api.common.encryption.EncryptionLayer

abstract trait Server {
  def getAuthHandler: AuthHandler

  def getDisplayName: String

  def setDisplayName(name: String)

  def getEncryptionLayer: EncryptionLayer
}