import driver.DriverB;
import transport.Car;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(
                "Лада",
                "Веста",
                2.0f);

        DriverB driver1 = new DriverB(
                "Иванов И.И.",
                10,
                car1);
        System.out.println(driver1);

    }
}