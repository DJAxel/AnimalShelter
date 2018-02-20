import java.util.Calendar;
import java.util.Date;

public class Dog extends Animal {
    private Date lastWalk;

    public Dog(String name, Gender gender) {
        super(name, gender);
        this.lastWalk = new Date();
    }

    @Override
    public String toString() {
        return super.toString() + ", last walk: " + lastWalk.toString(); // TODO format date
    }

    // GETTERS
    public Date getLastWalk() {
        return lastWalk;
    }

    public boolean needsWalk() {
        // TODO implement method
        return false;
    }


}
