import persons.DriverB;
import persons.Mechanic;
import persons.Sponsor;
import transport.*;
import transport.Transport;

public class Main {
    public static void main(String[] args) {

        DriverB driver1 = new DriverB(
                "Иванов И.И.",
                10);

        Sponsor sponsor1 = new Sponsor(
                "ФИО",
                50000,
                true);
        Mechanic mechanic1 = new Mechanic(
                "Фио",
                "ООО",
                true,
                true,
                false);
        Mechanic mechanic2 = new Mechanic(
                "Петров",
                "Компания",
                true,
                true,
                true);

        Car car1 = new Car(
                "Лада",
                "Веста",
                2.0f,
                BodyType.SEDAN);
        car1.setDriver(driver1);
        car1.addMechanic(mechanic1);
        car1.addSponsor(sponsor1);

        System.out.println(driver1);
        sponsor1.sponsorInfo();

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

        ServiceStation serviceStation= new ServiceStation();
        serviceStation.addCar(car1);
        serviceStation.addTruck(truck1);
        serviceStation.service();
        serviceStation.service();
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
