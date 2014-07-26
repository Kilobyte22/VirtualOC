package de.kilobyte22.voc.api.auth

trait User extends CommandSender {
  def username: String

  def email: String

  def connected: Boolean

  def displayName_=(name: String)

  def kick(reason: String = null)

  def delete
}