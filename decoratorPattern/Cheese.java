package designpatterns.decoratorPattern;

public class Cheese extends Toppings{

    Pizza pizza;

    public Cheese (Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription()  + ", Cheese";
    }

    public double cost() {
        return .50 + pizza.cost();
    }
}
