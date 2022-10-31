package transport;

public enum CarriageCapacity {

    N1( 0, 3.5f),
    N2(3.5f, 12f),
    N3(12f, Float.MAX_VALUE);

    private  final float capacityFrom;
    private  final float capacityTo;

    CarriageCapacity(float capacityFrom, float capacityTo) {
        this.capacityFrom = capacityFrom;
        this.capacityTo = capacityTo;
    }

    @Override
    public String toString() {
        return "Грузоподъемность: от " + capacityFrom + " тонн,  до " + capacityTo + " тонн.";
    }
}
