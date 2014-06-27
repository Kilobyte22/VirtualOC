package de.kilobyte22.voc.network

import de.kilobyte22.voc.api.network.{Node, Message}

class MessageImpl(source: Node, name: String, data: Array[AnyRef]) extends Message {

  var cancelled = false

  override def cancel() {
    cancelled = true
  }

  override def getData(): Array[AnyRef] = data

  override def getName(): String = name

  override def getSource(): Node = source

  def isCancelled = cancelled
}
