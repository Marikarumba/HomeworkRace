package transport;

public enum BodyType {

    SEDAN("Седан"),
    HATCHBACK("Хетчбек"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");
    private final String type;

    BodyType(String type) {
        this.type= type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Тип кузова: "+ name()+ " " + this.type;
    }
}
