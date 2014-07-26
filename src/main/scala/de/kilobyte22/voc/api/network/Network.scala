package de.kilobyte22.voc.api.network

import de.kilobyte22.voc.api.Persistable

abstract trait Network extends Persistable {
  def connect(node: Node): Boolean

  def disconnect(node: Node): Boolean

  def getNode(address: String): Node

  def getNodes: Iterable[Node]

  def getNodes(reference: Node): Iterable[Node]

  def sendToAddress(source: Node, target: String, name: String, data: AnyRef*)

  def sendToReachable(source: Node, name: String, data: AnyRef*)

  def sendToVisible(source: Node, name: String, data: AnyRef*)

  def registerSniffer(sniffer: Sniffer)

  def unregisterSniffer(sniffer: Sniffer)
}