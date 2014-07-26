package de.kilobyte22.voc.api.auth

trait AuthHandler {
  def canRegister: Boolean
  def register(username: String, email: String, password: String)

  def login(username: String, password: String)
}