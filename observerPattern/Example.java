package designpatterns.observerPattern;

public class Example {

    public static void main(String[] args) {
        WorkStation weather = new WorkStation();
        UserInterface userInterface = new UserInterface(weather);
        weather.setValue(10, 15, 20);

        Log log = new Log(weather);
        weather.setValue(20, 30, 40);

    }
}
