package de.kilobyte22.voc.api.network;

public interface Network {

    boolean connect(Node node);

    boolean disconnect(Node node);

    Node getNode(String address);

    Iterable<Node> getNodes();

    Iterable<Node> getNodes(Node reference);

    void sendToAddress(Node source, String target, String name, Object... data);

    void sendToReachable(Node source, String name, Object... data);

    void sendToVisible(Node source, String name, Object... data);

    void registerSniffer(Sniffer sniffer);

}
