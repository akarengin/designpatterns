package designpatterns.decoratorPattern;

public class PizzaOrder {

    public static void main(String[] args) {
        Pizza pizza = new ThinCrustPizza();
        System.out.println(pizza.getDescription() + " $" + pizza.cost());

        Pizza pizza1 = new ThickCrustPizza();
        pizza1 = new Cheese(pizza1);
        pizza1 = new Peppers(pizza1);
        pizza1 = new Olives(pizza1);

        System.out.println(pizza1.getDescription() + " $" + pizza1.cost());


    }
}
