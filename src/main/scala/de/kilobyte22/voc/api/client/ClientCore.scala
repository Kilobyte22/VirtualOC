package de.kilobyte22.voc.api.client

import de.kilobyte22.voc.api.common.CommonCore

abstract trait ClientCore extends CommonCore {
  def getServer: Server

  def connect(host: String, port: Int)

  def disconnect
}