package persons;

import transport.Transport;

import java.util.Objects;

public class Mechanic {

    private final String mechanicFullName;
    private final String mechanicCompany;
    private final boolean repairCar;
    private final boolean repairBus;
    private final boolean repairTruck;

    public Mechanic(String mechanicFullName,
                    String mechanicCompany,
                    boolean repairCar,
                    boolean repairBus,
                    boolean repairTruck) {
        if (mechanicFullName!= null) {
            this.mechanicFullName = mechanicFullName;
        }else {
            this.mechanicFullName = "Неизвестно";
        }
        if (mechanicCompany!= null) {
            this.mechanicCompany = mechanicCompany;
        }else {
            this.mechanicCompany = "Неизвестно";
        }
        this.repairCar = repairCar;
        this.repairBus = repairBus;
        this.repairTruck = repairTruck;
    }

    public String getMechanicFullName() {
        return mechanicFullName;
    }

    public String getMechanicCompany() {
        return mechanicCompany;
    }

    public boolean isRepairCar() {
        return repairCar;
    }

    public boolean isRepairBus() {
        return repairBus;
    }

    public boolean isRepairTruck() {
        return repairTruck;
    }

    public void carryOutMaintenance (Transport transport){

    }
    public void repair (Transport transport){
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return repairCar == mechanic.repairCar && repairBus == mechanic.repairBus && repairTruck == mechanic.repairTruck && Objects.equals(mechanicFullName, mechanic.mechanicFullName) && Objects.equals(mechanicCompany, mechanic.mechanicCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mechanicFullName, mechanicCompany, repairCar, repairBus, repairTruck);
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "mechanicFullName='" + mechanicFullName + '\'' +
                ", mechanicCompany='" + mechanicCompany + '\'' +
                ", repairCar=" + repairCar +
                ", repairBus=" + repairBus +
                ", repairTruck=" + repairTruck +
                '}';
    }
}
