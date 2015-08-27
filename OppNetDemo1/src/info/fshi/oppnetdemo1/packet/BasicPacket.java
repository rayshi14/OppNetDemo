package info.fshi.oppnetdemo1.packet;

public abstract class BasicPacket {
	// BT messge header
	// format:  type|data
	public static final String PACKET_TYPE = "type";
	public static final String PACKET_ID = "id";
	public static final String PACKET_PATH = "path";
	public static final String PACKET_DATA = "data";
	
	// data type identifier
	public static final int PACKET_TYPE_QUEUE_SIZE = 100;
	public static final int PACKET_TYPE_QUEUE_SIZE_REQUEST = 101;
	public static final int PACKET_TYPE_DATA = 102;
	public static final int PACKET_TYPE_DATA_ACK = 103;
	
}
