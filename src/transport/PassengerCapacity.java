package transport;

public enum PassengerCapacity {

    XS( 0, 10),
    S( 0, 25),
    M( 40, 50),
    L(60, 80),
    XL(100, 120);

    private final int capacityFrom;
    private final int CapacityTo;

    PassengerCapacity(int capacityFrom, int capacityTo) {
        this.capacityFrom = capacityFrom;
        CapacityTo = capacityTo;
    }

    @Override
    public String toString() {
        return "Тип вместимости: от " + capacityFrom + " мест, до " + CapacityTo + " мест.";
    }
}
