package designpatterns.factoryPattern;

public class PacificCalendar extends  Calendar{

    public PacificCalendar(ZoneFactory zoneFactory) {
        zone = zoneFactory.createZone("US/Pacific");
    }

    public void createCalendar() {
        System.out.println("Making the calendar");
    }
}
