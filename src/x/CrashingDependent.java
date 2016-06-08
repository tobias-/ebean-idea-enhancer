package x;

import javax.persistence.Entity;
import java.util.Random;

@Entity
public class CrashingDependent {
    Z another() {
        Z z;
        switch (new Random().nextInt(2)) {
            case 1:
                z = new Y();
                break;
            case 0:
                z = new X();
                break;
            default:
                throw new IllegalArgumentException("");
        }
        return z;
    }
}
