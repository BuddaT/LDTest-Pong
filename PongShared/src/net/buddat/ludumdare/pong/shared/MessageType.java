package net.buddat.ludumdare.pong.shared;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Message that may be sent, either from client to server or vice versa.
 */
public enum MessageType
{
    /**
     * Heartbeat to allow server to disconnect if non-responsive.
     */
    KEEP_ALIVE(0x0),
    /**
     * Client login
     */
    LOGIN(0x1),
    /**
     * Client logout
     */
    LOGOUT(0x2);

    private static final Map<Integer, MessageType> ID_TO_TYPE;
    static {
        Map<Integer, MessageType> idToType = new HashMap<>();
        for (MessageType messageType : MessageType.values()) {
            idToType.put(messageType.id, messageType);
        }
        ID_TO_TYPE = Collections.unmodifiableMap(idToType);
    }

    private final int id;


    private MessageType(int typeId) {
        this.id = typeId;
    }

    public static MessageType forId(int id) {
        return ID_TO_TYPE.get(id);
    }
}
