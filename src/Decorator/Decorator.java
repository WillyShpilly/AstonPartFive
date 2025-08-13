package Decorator;

abstract class Decorator implements Beverage {
    protected Beverage beverage;

    public Decorator(Beverage b) {
        this.beverage = b;
    }

    @Override
    public abstract double cost();
    @Override
    public abstract String description();
}
