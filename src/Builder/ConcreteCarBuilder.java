package Builder;

public class ConcreteCarBuilder implements CarBuilder {
    private final Car car;

    public ConcreteCarBuilder() {
        this.car = new Car();
    }

    @Override
    public void setColor(String color) {
        car.setColor(color);
    }

    @Override
    public void setEngineType(String engineType) {
        car.setEngineType(engineType);
    }

    @Override
    public void setNumberOfDoors(int numberOfDoors) {
        car.setNumberOfDoors(numberOfDoors);
    }

    @Override
    public Car build() {
        return car;
    }
}
