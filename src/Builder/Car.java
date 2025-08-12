package Builder;

class Car {
    private String color;
    private String engineType;
    private int numberOfDoors;

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Автомобиль{" +
                "color='" + color + '\'' +
        ", engineType='" + engineType + '\'' +
        ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
