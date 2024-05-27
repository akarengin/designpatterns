package designpatterns.strategyPattern;

public class CameraPlusApp extends PhoneCamereApp{

    public CameraPlusApp() {
        shareBehavior = new CameraPlusShare();
    }

    public void edit() {
        System.out.println("It's a cool edition");
    }
}
