package Decorator;

class Foam extends Decorator {
    public Foam(Beverage b) {
        super(b);
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.0;
    }

    @Override
    public String description() {
        return beverage.description() + ", с пенкой";
    }
}