package de.kilobyte22.voc.network

import de.kilobyte22.voc.api.network.{Node, Message}

class MessageImpl(val source: Node, val name: String, val data: Array[AnyRef]) extends Message {

  var cancelled = false

  override def cancel() {
    cancelled = true
  }
}
