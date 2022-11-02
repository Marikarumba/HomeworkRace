package transport;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Truck extends Transport implements Competing{
    private final CarriageCapacity carriageCapacity;

    public Truck(String brand, String model, Float engineVolume, CarriageCapacity carriageCapacity) {
        super(brand, model, engineVolume);
        this.carriageCapacity = carriageCapacity;
    }

    public CarriageCapacity getCarriageCapacity() {
        return carriageCapacity;
    }

    @Override
    public void startMovement() {
        System.out.println("transport.Truck " + this.getBrand() + this.getModel() + " started movement");
    }

    @Override
    public void stopMovement() {
        System.out.println("transport.Truck " + this.getBrand() + this.getModel() + " stopped movement");
    }


    @Override
    public void pitStop() {
        System.out.println("Truck "+ this.getBrand() + this.getModel() + " performed pit stop");
    }

    @Override
    public int getBestTime() {
        return ThreadLocalRandom.current().nextInt(1,100);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 300);
    }

    @Override
    public void printType() {
        if ( this.carriageCapacity!= null){
            System.out.println(carriageCapacity);
        } else {
            System.out.println("данных по авто недостаточно");
        }
    }

    @Override
    public boolean service() {
        return Math.random()>0.5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return carriageCapacity == truck.carriageCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carriageCapacity);
    }
}
