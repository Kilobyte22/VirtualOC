package de.kilobyte22.voc.api.common.encryption

import de.kilobyte22.voc.api.common.networking.BidirectionalDataStream

trait EncryptionLayerFactory[T <: EncryptionLayer] {
  def create(stream: BidirectionalDataStream): T
}