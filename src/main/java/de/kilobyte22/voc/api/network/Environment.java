package de.kilobyte22.voc.api.network;

import de.kilobyte22.voc.api.Persistable;

public interface Environment extends Persistable {

    Node getNode();

    void onConnect(Node node);

    void onDisconnect(Node node);

    void onMessage(Message message);

}
