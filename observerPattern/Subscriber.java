package observerPattern;

public class Subscriber implements SubscriberObserver {

    private String subscriberName;

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void updateSubscriber() {

        System.out.println("\n" + subscriberName + "! News Flash at your doorstep!");

    }

}
