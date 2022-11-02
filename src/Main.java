import driver.DriverB;
import transport.*;
import transport.Transport;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(
                "Лада",
                "Веста",
                2.0f,
                BodyType.SEDAN);

        DriverB driver1 = new DriverB(
                "Иванов И.И.",
                10,
                car1);
        System.out.println(driver1);

        car1.printType();

        Car car2 = new Car(
                "Лада",
                "Веста",
                2.0f,
                null);
        car2.printType();

        Bus bus1 = new Bus(
                "Автобус",
                "обыкновенный",
                2.0f,
                PassengerCapacity.XL);

        bus1.printType();

        Truck truck1 = new Truck(
                "Грузовик",
                "обыкновенный",
                3f,
                CarriageCapacity.N2);
        truck1.printType();


        service(truck1,bus1,car2, car1);
    }

    private static void service(Transport... transports){
        for (Transport transport : transports) {
            try{
                if (!transport.service()) {
                    throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " не прошел диагностику!");
                }
            } catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        }
    }


    }
