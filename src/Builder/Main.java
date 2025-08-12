package Builder;

public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new ConcreteCarBuilder();
        Director director = new Director(builder);

        Car sportsCar = director.constructSportsCar();
        System.out.println(sportsCar.toString());

        Car familyCar = director.constructFamilyCar();
        System.out.println(familyCar.toString());
    }
}
