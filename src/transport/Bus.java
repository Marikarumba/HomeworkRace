package transport;

import persons.Driver;
import persons.DriverD;
import persons.Mechanic;
import persons.Sponsor;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport implements Competing{
    private final PassengerCapacity passengerCapacity;
    public <driverD1er> Bus(String brand,
                            String model,
                            Float engineVolume,
                            PassengerCapacity passengerCapacity) {
        super(brand, model, engineVolume);
        this.passengerCapacity = passengerCapacity;
    }

    public PassengerCapacity getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public void startMovement() {
        System.out.println("transport.Bus " + this.getBrand() + this.getModel() + " started movement");
    }

    @Override
    public void stopMovement() {
        System.out.println("transport.Bus " + this.getBrand() + this.getModel() + " stopped movement");
    }


    @Override
    public void pitStop() {
        System.out.println("Bus "+ this.getBrand() + this.getModel() + " performed pit stop");
    }

    @Override
    public int getBestTime() {
        return ThreadLocalRandom.current().nextInt(1,100);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(1,300);
    }

    @Override
    public void printType() {
        if ( this.passengerCapacity!= null){
            System.out.println(passengerCapacity);
        } else {
            System.out.println("данных по авто недостаточно");
        }
    }

    @Override
    public boolean service() {
        System.out.println("Автобус " + getBrand() +" " + getModel() + " в диагностике не требуется");
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return passengerCapacity == bus.passengerCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengerCapacity);
    }
}
