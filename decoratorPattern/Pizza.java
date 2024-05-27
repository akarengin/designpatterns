package designpatterns.decoratorPattern;

public abstract class Pizza {

    String description = "Unknown description";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
