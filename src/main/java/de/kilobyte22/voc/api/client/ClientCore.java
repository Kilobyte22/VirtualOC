package de.kilobyte22.voc.api.client;

import de.kilobyte22.voc.api.common.CommonCore;

public interface ClientCore extends CommonCore {
    Server getServer();
    void connect(String host, int port);
    void disconnect();
}
