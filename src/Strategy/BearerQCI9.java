package Strategy;

public class BearerQCI9 implements IBearer {
    @Override
    public Packet transportPacket(Packet packet) {
        System.out.println("packet was transported with highest priority ~ voice packet");
        packet.setStatus("sent");
        return packet;
    }
}
