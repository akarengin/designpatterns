package designpatterns.strategyPattern;

public class CameraPlusShare implements ShareBehavior{

    public void share() {
        System.out.println("It's a cool way of sharing");
    }
}
