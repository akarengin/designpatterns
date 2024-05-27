package designpatterns.observerPattern;

import java.util.logging.Logger;

public class Log implements Observer{
    private int temp;
    private int speed;
    private int press;
    private Subject workStation;

    private static final Logger log = Logger.getLogger(Log.class.getName());

    public Log(Subject workStation) {
        this.workStation = workStation;
        workStation.registerObserver(this);
    }

    public void update(int temp, int speed, int press) {
        this.temp = temp;
        this.speed = speed;
        this.press = press;
        log();
    }

    public void log() {
        log.info("Temperature log: " + temp);
        log.info("WindSpeed log: " + speed);
        log.info("Pressure log: " + press);
    }

}
