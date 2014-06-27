package de.kilobyte22.voc.api.network;

import java.util.Set;

public interface Sniffer {

    void onMessage(Network network, Set<Node> receivers, Message message);

    void onConnect(Network network, Node node);

    void onDisconnect(Network network, Node node);

}
