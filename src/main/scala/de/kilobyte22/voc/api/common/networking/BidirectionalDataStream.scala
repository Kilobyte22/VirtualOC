package de.kilobyte22.voc.api.common.networking

import java.io._

class BidirectionalDataStream(in: DataInputStream, out: DataOutputStream) extends Closeable {

  def getInput: DataInput = in

  def getOutput: DataOutput = out

  def close {
    in.close
    out.close
  }

  def flush {
    out.flush
  }
}