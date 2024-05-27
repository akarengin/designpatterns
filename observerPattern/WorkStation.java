package designpatterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class WorkStation implements Subject {
    private List<Observer> observers;

    private int temperature;
    private int windSpeed;
    private int pressure;

    public WorkStation() {
        observers = new ArrayList<>();
    }


    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i > 0) {
            observers.remove(i);
        }
    }

    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(temperature, windSpeed, pressure);
        }
    }

    public void setValue(int temperature, int windSpeed, int pressure) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        notifyObserver();
    }
}
