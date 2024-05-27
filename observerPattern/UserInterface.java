package designpatterns.observerPattern;

public class UserInterface implements Observer{
    private int temp;
    private int speed;
    private int press;
    private Subject workStation;

    public UserInterface(Subject workStation) {
        this.workStation = workStation;
        workStation.registerObserver(this);
    }

    public void update(int temp, int speed, int press) {
        this.temp = temp;
        this.speed = speed;
        this.press = press;
        display(temp);
    }

    public void display(int value) {
        System.out.println("Temperature: " + temp);
        System.out.println("Speed: " + speed);
        System.out.println("Pressure: " + press);
    }
}
