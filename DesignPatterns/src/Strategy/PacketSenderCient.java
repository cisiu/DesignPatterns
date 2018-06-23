package Strategy;

public class PacketSenderCient {
    private IBearer bearer;
    public PacketSenderCient(IBearer bearer){
        this.bearer = bearer;
    }
    public Packet sendPacket(Packet packet){
        bearer.transportPacket(packet);
        return packet;
    }
}
