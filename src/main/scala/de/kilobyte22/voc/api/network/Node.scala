package de.kilobyte22.voc.api.network

import de.kilobyte22.voc.api.Persistable

abstract trait Node extends Persistable {
  def getHost: Environment

  def getVisibility: Visibility

  def getAddress: String

  def getNetwork: String

  def canBeReachedFrom(node: Node): Boolean

  def getReachableNodes: Iterable[Node]

  def sendToAddress(address: String, name: String, data: AnyRef*)

  def sendToReachable(name: String, data: AnyRef*)

  def sendToVisible(name: String, data: AnyRef*)
}