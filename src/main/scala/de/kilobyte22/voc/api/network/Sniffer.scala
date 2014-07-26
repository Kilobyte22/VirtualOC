package de.kilobyte22.voc.api.network

import java.util.Set

abstract trait Sniffer {
  def onMessage(network: Network, receivers: Set[Node], message: Message)

  def onConnect(network: Network, node: Node)

  def onDisconnect(network: Network, node: Node)
}