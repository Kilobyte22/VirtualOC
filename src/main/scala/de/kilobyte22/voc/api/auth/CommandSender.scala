package de.kilobyte22.voc.api.auth

trait CommandSender {
  def hasPermission(permission: String): Boolean

  def hasPermission(permission: String, `object`: Permissible): Boolean

  def getDisplayName: String
}