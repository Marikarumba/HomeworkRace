package persons;
import transport.Car;

public class DriverB  extends Driver<Car>  {

    public DriverB(String fullName, int experience) {
        super(fullName, "B", experience);
    }

    public DriverB(String fullName, String licenseType, int experience) {
        super(fullName, licenseType, experience);
    }
}