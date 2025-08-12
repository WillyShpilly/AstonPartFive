package Builder;

class Director {
    private final CarBuilder builder;

    public Director(CarBuilder builder) {
        this.builder = builder;
    }

    public Car constructSportsCar() {
        builder.setColor("Red");
        builder.setEngineType("V8");
        builder.setNumberOfDoors(2);
        return builder.build();
    }

    public Car constructFamilyCar() {
        builder.setColor("Blue");
        builder.setEngineType("I4");
        builder.setNumberOfDoors(4);
        return builder.build();
    }
}
