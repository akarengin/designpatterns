package designpatterns.factoryPattern;

public class CalendarTest {
    public static void main(String[] args) {
        ZoneFactory zoneFactory = new ZoneFactory();
        Calendar calendar = new PacificCalendar(zoneFactory);
        calendar.createCalendar();
        calendar.print();
    }
}
