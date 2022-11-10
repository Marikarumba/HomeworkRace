package transport;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Car extends Transport implements Competing{

    private BodyType bodyType;
    public Car(String brand,
               String model,
               Float engineVolume,
               BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    @Override
    public void startMovement() {
        System.out.println("transport.Car " + this.getBrand() + this.getModel() + " started movement");
    }

    @Override
    public void stopMovement() {
        System.out.println("transport.Car " + this.getBrand() + this.getModel() + " stopped movement");
    }

    @Override
    public void pitStop() {
        System.out.println("Car "+ this.getBrand() + this.getModel() + " performed pit stop");
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
        if (this.bodyType != null){
            System.out.println(bodyType);
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
        Car car = (Car) o;
        return bodyType == car.bodyType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bodyType);
    }

    @Override
    public String toString() {
        return "Машина" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + getEngineVolume() +
                "bodyType=" + bodyType +
                '}';
    }
    
    public void printInfoCar(){
        System.out.println( toString());
        System.out.println(sponsors.toString());
        System.out.println(mechanics.toString());
        
    }
}
