package designpatterns.decoratorPattern;

public class ThinCrustPizza extends Pizza{

    public ThinCrustPizza () {
        description = "ThinCrustPizza";
    }

    public double cost() {
        return 1.5;
    }
}
