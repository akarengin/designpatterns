package designpatterns.decoratorPattern;

public class Olives extends Toppings{

    Pizza pizza;

    public Olives (Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }

    public double cost() {
        return 0.4 + pizza.cost();
    }
}
