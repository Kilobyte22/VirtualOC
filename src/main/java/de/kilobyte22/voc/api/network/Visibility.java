package de.kilobyte22.voc.api.network;

public enum Visibility {

    /**
     * Visible to every network, even through routers
     */
    GLOBAL,

    /**
     * Not visible through for example routers
     */
    NETWORK,

    /**
     * Nobody can see me D:
     */
    NONE
}
