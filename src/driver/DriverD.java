package driver;
import transport.Bus;

public class DriverD extends Driver<Bus>{

    public DriverD(String fullName, int experience, Bus car) {
        super(fullName, "D", experience, car);
    }
}
