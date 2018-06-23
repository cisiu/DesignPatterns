package Strategy;

public class BearerQCI5 implements IBearer{

    @Override
    public Packet transportPacket(Packet packet) {
        System.out.println("packet was transported with medium priority ~ SIP packet");
        packet.setStatus("sent");
        return packet;
    }
}
