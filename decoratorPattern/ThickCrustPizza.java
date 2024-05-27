package designpatterns.decoratorPattern;

public class ThickCrustPizza extends Pizza{

    public ThickCrustPizza() {
        description =  "ThickCrustPizza";
    }

    public double cost() {
        return 1.0;
    }
}
