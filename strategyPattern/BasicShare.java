package designpatterns.strategyPattern;

public class BasicShare implements ShareBehavior{

    public void share() {
        System.out.println("It's basic share");
    }
}
