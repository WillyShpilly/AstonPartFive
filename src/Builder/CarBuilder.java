package Builder;

public interface CarBuilder {
    void setColor(String color);
    void setEngineType(String engineType);
    void setNumberOfDoors(int numberOfDoors);
    Car build();
}
