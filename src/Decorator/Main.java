package Decorator;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new SimpleCoffee();
        System.out.println(coffee.description());
        System.out.println("Цена: $" + coffee.cost());

        Beverage milkCoffee = new Milk(coffee);
        System.out.println(milkCoffee.description());
        System.out.println("Цена: $" + milkCoffee.cost());

        Beverage latte = new Foam(milkCoffee);
        System.out.println(latte.description());
        System.out.println("Цена: $" + latte.cost());
    }
}
