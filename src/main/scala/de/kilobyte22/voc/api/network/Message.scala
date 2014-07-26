package de.kilobyte22.voc.api.network

/**
 * This type is used to deliver messages sent in a component network.
 * <p/>
 * We use an extra class to deliver messages to nodes to make the cancel logic
 * more clear (returning a boolean can get annoying very fast).
 */
abstract trait Message {
  /**
   * The node that sent the message.
   *
   * @return the source node.
   */
  def getSource: Node

  /**
   * The name of this message.
   *
   * @return the name of the message.
   */
  def getName: String

  /**
   * The values passed along in the message.
   *
   * @return the message data.
   */
  def getData: Array[AnyRef]

  /**
   * Stop further propagation of a broadcast message.
   * <p/>
   * This can be used to stop further distributing messages when either
   * serving a message to a specific address and there are multiple nodes
   * with that address, or when serving a broadcast message.
   */
  def cancel
}