package de.kilobyte22.voc.api.network

import de.kilobyte22.voc.api.Persistable

abstract trait Node extends Persistable {
  def host: Environment

  def visibility: Visibility

  def address: String

  def network: Network

  def canBeReachedFrom(node: Node): Boolean

  def reachableNodes: Iterable[Node]

  def sendToAddress(address: String, name: String, data: AnyRef*)

  def sendToReachable(name: String, data: AnyRef*)

  def sendToVisible(name: String, data: AnyRef*)
}