package Decorator;

public class SimpleCoffee implements Beverage{
    @Override
    public double cost() {
        return 5.0;
    }

    @Override
    public String description() {
        return "Обычный черный кофе";
    }
}
