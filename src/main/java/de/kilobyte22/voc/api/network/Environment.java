package de.kilobyte22.voc.api.network;

public interface Environment {

    Node getNode();

    void onConnect(Node node);

    void onDisconnect(Node node);

    void onMessage(Message message);

}
