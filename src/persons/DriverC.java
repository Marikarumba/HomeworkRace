package persons;
import transport.Truck;

public class DriverC extends Driver<Truck>{

    public DriverC(String fullName, int experience, Truck car) {
        super(fullName, "C", experience, car);
    }
}
