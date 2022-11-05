package transport;

import persons.Driver;
import persons.Mechanic;
import persons.Sponsor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport {

    private final String brand;
    private final String model;
    private final Float engineVolume;

    public Driver driver;
    public List<Mechanic> mechanics;
    public List<Sponsor> sponsors;



    public Transport(String brand,
                     String model,
                     Float engineVolume) {
        this.driver = null;
        this.mechanics = new ArrayList<>();
        this.sponsors = new ArrayList<>();

        if (brand == null){
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume == null) {
            this.engineVolume = 1.5f;
        }else {
            this.engineVolume = engineVolume;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Float getEngineVolume() {
        return engineVolume;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public abstract void startMovement();
    public abstract void stopMovement();
    public abstract void printType();
    public abstract boolean service();

  public void addMechanic (Mechanic mechanic) {
      mechanics.add(mechanic);
  }
    public void addSponsor (Sponsor sponsor) {
        sponsors.add(sponsor);
    }


    public void printPersonsInfo(){
        System.out.println("Водитель: " + driver.getFullName());
        for (Mechanic mechanic: mechanics){
            System.out.println(mechanic);
        }
        for (Sponsor sponsor: sponsors){
            System.out.println(sponsor);
        }
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(engineVolume, transport.engineVolume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "transport.Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
