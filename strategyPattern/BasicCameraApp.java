package designpatterns.strategyPattern;

public class BasicCameraApp extends PhoneCamereApp{

    public BasicCameraApp () {
        shareBehavior = new BasicShare();
    }

    public void edit() {
        System.out.println("It's a basic edition");
    }
}
