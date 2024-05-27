package designpatterns.strategyPattern;

public abstract class PhoneCamereApp {

    ShareBehavior shareBehavior;

    public PhoneCamereApp() {

    }

    public void setShareBehavior(ShareBehavior shareBehavior) {
        this.shareBehavior = shareBehavior;
    }

    abstract void edit();

    public void performShare() {
        shareBehavior.share();
    }

    public void take() {
        System.out.println("All phones can take photos");
    }

    public void save() {
        System.out.println("All phones can save photos");
    }
}
