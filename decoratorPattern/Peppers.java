package designpatterns.decoratorPattern;

public class Peppers extends Toppings{
    Pizza pizza;

    public Peppers(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Peppers";
    }

    public double cost() {
        return 0.3 + pizza.cost();
    }
}
