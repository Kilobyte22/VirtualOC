package de.kilobyte22.voc.api.auth

trait Permissible {
  def getType: String

  def ID: Int
}