package designpatterns.strategyPattern;

public class PhoneCameraAppTest {

    public static void main(String[] args) {
        PhoneCamereApp basicCameraApp = new BasicCameraApp();
        basicCameraApp.performShare();
    }
}
