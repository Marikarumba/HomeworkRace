package transport;

import transport.Transport;

import java.util.concurrent.ThreadLocalRandom;

public class Truck extends Transport implements Competing{

    public Truck(String brand, String model, Float engineVolume) {
        super(brand, model, engineVolume);
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
}
