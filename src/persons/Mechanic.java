package persons;

import transport.Transport;

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
}
