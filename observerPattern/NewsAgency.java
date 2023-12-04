package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsAgencySubject{

    public List<Subscriber> subscriberList = new ArrayList<>();

    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public String notifySubscriber() {

        String news = new String();

        for (Subscriber subscriber : subscriberList) {

            subscriber.updateSubscriber();

        }

        return news;

    }

}
