package persons;

import transport.Transport;

import java.util.Objects;

public abstract class Driver <T extends Transport> {

    private final String fullName;
    private String licenseType;
    private final int experience;
    private final T car;


    public Driver(String fullName, String licenseType, int experience) {
        this.fullName = fullName;
        this.licenseType = licenseType;
        this.experience = experience;
        this.car = null;
    }
    public Driver(String fullName, String licenseType, int experience, T car) {
        this.fullName = fullName;
        this.licenseType = licenseType;
        this.experience = experience;
        this.car = car;
    }

    public void setLicenseType(String licenseType) {
        if (licenseType==null){
            throw new IllegalArgumentException("Необходимо указать тип прав!");
        }
        this.licenseType = licenseType;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public int getExperience() {
        return experience;
    }

    public void startMovement() {
        System.out.printf("Driver %s started moving",this.fullName);
        this.car.startMovement();

    }

    public void stopMovement() {
            System.out.printf("Driver %s stopped moving",this.fullName);
            this.car.stopMovement();
    }

    public void refill() {
                System.out.printf("Driver %s refilling %s %s"
                        ,this.fullName, this.car.getBrand(), this.car.getModel());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return experience == driver.experience && Objects.equals(fullName, driver.fullName) && Objects.equals(licenseType, driver.licenseType) && Objects.equals(car, driver.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, licenseType, experience, car);
    }

    @Override
    public String toString() {
        return String.format("Водитель %s  будет участвовать в заезде", this.fullName);

    }
}
