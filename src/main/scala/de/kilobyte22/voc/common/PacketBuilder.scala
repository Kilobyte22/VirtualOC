package de.kilobyte22.voc.common

import java.io.{DataOutputStream, ByteArrayOutputStream}
import de.kilobyte22.voc.common.PacketType.PacketType

class PacketBuilder {

  private val bos = new ByteArrayOutputStream
  private val dos = new DataOutputStream(bos)

  def apply(value: Array[Byte]) = {
    dos.write(value)
    this
  }

  def apply(value: Boolean) = {
    dos.writeBoolean(value)
    this
  }

  def apply(value: Double) = {
    dos.writeDouble(value)
    this
  }

  def apply(value: Int) = {
    dos.writeInt(value)
    this
  }

  def apply(value: String) = {
    dos.writeUTF(value)
    this
  }

  def toByteArray = bos.toByteArray
}

object PacketBuilder {
  implicit def toByteArray(b: PacketBuilder) = b.toByteArray

  private def m = new PacketBuilder

  def apply(id: PacketType) = m(id.id)
}
