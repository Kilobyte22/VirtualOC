package de.kilobyte22.voc.client.auth

import de.kilobyte22.voc.api.auth.AuthHandler

class AuthHandlerImpl extends AuthHandler {
  override def login(username: String, password: String): Unit = ???

  override def register(username: String, email: String, password: String): Unit = ???

  override def canRegister: Boolean = ???
}
