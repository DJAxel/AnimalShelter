import java.util.Date;

public class Reservor {
    private String name;
    private Date reservedAt;

    Reservor(String name, Date reservedAt) {
        this.name = name;
        this.reservedAt = reservedAt;
    }

    // GETTERS
    public String getName() {
        return name;
    }

    public Date getReservedAt() {
        return reservedAt;
    }
}
