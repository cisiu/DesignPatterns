package Strategy;

public class TestCase1 {
    public static void main(String[] args) {
        Packet packetNr1 = new Packet();
        BearerQCI1 bearerQCI1 = new BearerQCI1();
        PacketSenderCient packetSenderClient = new PacketSenderCient(bearerQCI1);
        packetSenderClient.sendPacket(packetNr1);
    }
}
