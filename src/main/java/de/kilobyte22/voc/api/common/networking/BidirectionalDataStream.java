package de.kilobyte22.voc.api.common.networking;

import java.io.*;

public class BidirectionalDataStream implements Closeable {

    private final DataInputStream in;
    private final DataOutputStream out;

    public BidirectionalDataStream(DataInputStream in, DataOutputStream out) {
        this.in = in;
        this.out = out;
    }

    public DataInput getInput() {
        return in;
    }

    public DataOutput getOutput() {
        return out;
    }

    public void close() throws IOException {
        in.close();
        out.close();
    }

    public void flush() throws IOException {
        out.flush();
    }
}
