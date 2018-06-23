package Strategy;

public class Packet {
    private String status;
    Packet(){
        this.status = "incoming";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
