package de.kilobyte22.voc.api.network

import de.kilobyte22.voc.api.Persistable

trait Environment extends Persistable {
  def node: Node

  def onConnect(node: Node)

  def onDisconnect(node: Node)

  def onMessage(message: Message)
}