import java.text.MessageFormat;
import java.util.Date;

public class Animal {
    public String name;
    public Gender gender;
    public Reservor reservedBy;

    Animal(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public boolean reserve(String reservedBy) {
        if(this.reservedBy == null) {
            this.reservedBy = new Reservor(reservedBy, new Date());
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String reserved = "not reserved";
        if(this.reservedBy != null) {
            reserved = "reserved by " + this.reservedBy.getName();
        }
        return MessageFormat.format("{0}, {1}, {2}", this.name, this.gender, reserved);
    }
}
