package de.kilobyte22.voc.api.auth

import com.sun.istack.internal.Nullable

trait User extends CommandSender {
  def getUsername: String

  def getEmail: String

  def isConnected: Boolean

  def setDisplayName(name: String)

  def kick(@Nullable reason: String)

  def delete
}