package de.kilobyte22.voc.client

import de.kilobyte22.voc.common.{PacketType => PT, PacketBuilder}

object PacketSender {
  private def send(p: Array[Byte]) = Client.server match {
    case Some(server) => server.getEncryptionLayer.sendPacket(p)
    case None => Unit
  }

  def sendSignUp(username: String, hashedPassword: String, email: String) =
    send(PacketBuilder(PT.Register)(username)(hashedPassword)(email)) // did i mention i love scala?

  def sendLogin(username: String, hashedPassword: String) =
    send(PacketBuilder(PT.Login)(username)(hashedPassword))

  def sendCustomPacket(pluginID: String, packet: Array[Byte]) =
    send(PacketBuilder(PT.Custom)(pluginID)(packet))

}
