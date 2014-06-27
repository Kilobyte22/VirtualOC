package de.kilobyte22.voc.api.network;

import de.kilobyte22.voc.api.Persistable;

public interface Node extends Persistable {

    Environment getHost();

    Visibility getVisibility();

    String getAddress();

    String getNetwork();

    boolean canBeReachedFrom(Node node);

    Iterable<Node> getReachableNodes();

    void sendToAddress(String address, String name, Object... data);

    void sendToReachable(String name, Object... data);

    void sendToVisible(String name, Object... data);

}
