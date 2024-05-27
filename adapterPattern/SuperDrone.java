package designpatterns.adapterPattern;

public class SuperDrone implements Drone{
    public void beep() {
        System.out.println("Beep beep beep");
    }

    public void spinRotors() {
        System.out.println("Rotors are spinning");
    }

    public void takeOff() {
        System.out.println("Taking off");
    }
}
