package de.kilobyte22.voc.api.network

import de.kilobyte22.voc.api.Persistable

abstract trait Environment extends Persistable {
  def getNode: Node

  def onConnect(node: Node)

  def onDisconnect(node: Node)

  def onMessage(message: Message)
}