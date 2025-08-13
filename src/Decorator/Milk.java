package Decorator;

public class Milk extends Decorator {
    public Milk(Beverage b) {
        super(b);
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.5;
    }

    @Override
    public String description() {
        return beverage.description() + ", с молоком";
    }
}
