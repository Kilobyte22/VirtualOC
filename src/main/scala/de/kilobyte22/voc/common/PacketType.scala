package de.kilobyte22.voc.common

object PacketType extends Enumeration {
  type PacketType = Value
  val

  Register,         // register new account
  Login,            // log in
  Custom,           // custom packet from a plugin
  Welcome,          // login successful
  Gtfo,             // kick
  Shutdown,         // Server shutdown/restart
  MonitorUpdate,    // Changes on monitor
  MonitorSubscribe, // Subscribe or unsubscribe to a certain monitor
  NetworkList,      // Lists all networks with access
  NetworkInfo,      // Gathers information about a network
  NetworkMod,       // Changes a network
  NetworkCreate,    // Makes a new network
  NetworkDelete,    // Deletes a network
  PermissionError   // Raised when a permission isn't set
  = Value
}
