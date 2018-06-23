package Strategy;

public class BearerQCI9 implements IBearer {
    @Override
    public Packet transportPacket(Packet packet) {
        System.out.println("packet was transported with lowest priority ~ data packet");
        packet.setStatus("sent");
        return packet;
    }
}
