package observerPattern;

public interface NewsAgencySubject {

    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    String notifySubscriber();

}
