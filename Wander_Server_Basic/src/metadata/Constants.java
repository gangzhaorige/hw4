package metadata;

/**
 * The Constants class stores important variables as constants for later use.
 */
public class Constants {

    // Request (1xx) + Response (2xx)
    public final static short CMSG_AUTH = 101;
    public final static short SMSG_AUTH = 201;
    public final static short CMSG_HEARTBEAT = 102;
    public final static short SMSG_HEARTBEAT = 202;
    public final static short CMSG_PLAYERS = 103;
    public final static short SMSG_PLAYERS = 203;
    public static final short CMSG_TEST = 104;
    public static final short SMSG_TEST = 204;
    public final static short CMSG_REG = 105;
    public final static short SMSG_REG = 205;
    public final static short CMSG_MOVE = 106;
    public final static short SMSG_MOVE = 206;
    public final static short CMSG_SPAWN = 107;
    public final static short SMSG_SPAWN = 207;
    // Other
    public static final String CLIENT_VERSION = "1.00";
    public static final int TIMEOUT_SECONDS = 90;

}
