package de.kilobyte22.voc.network

import de.kilobyte22.voc.api.{network => api}
import de.kilobyte22.voc.api.network.{Sniffer, Node}
import java.lang.Iterable
import scala.collection.mutable
import scala.collection.convert.WrapAsScala._
import scala.collection.convert.WrapAsJava._

class Network extends api.Network {

  private val sniffers = new mutable.ArrayBuffer[Sniffer]
  private val nodes = new mutable.ArrayBuffer[Node]
  private val namedNodes = mutable.Map.empty[String, mutable.ArrayBuffer[Node]] // TODO: FIX COMPILE ERROR

  override def registerSniffer(sniffer: Sniffer) {
    sniffers += sniffer
  }

  def unregisterSniffer(sniffer: Sniffer) {
    sniffers -= sniffer
  }

  override def sendToVisible(source: Node, name: String, data: AnyRef*): Unit = ()

  override def sendToReachable(source: Node, name: String, data: AnyRef*) {
    val nodes = getNodes(source).toSet
    val message = new MessageImpl(source, name, data.toArray)
    sniffers.foreach { sniffer =>
      if (!message.isCancelled)
        sniffer.onMessage(this, nodes, message)
    }
    getNodes(source).foreach {node =>
      node.getHost.onMessage(message)
    }

  }

  override def sendToAddress(source: Node, target: String, name: String, data: AnyRef*) {

  }

  override def getNodes(reference: Node): Iterable[Node] = null

  override def getNodes: Iterable[Node] = null

  override def getNode(address: String): Node = null

  override def disconnect(node: Node): Boolean = false

  override def connect(node: Node): Boolean = false
}
