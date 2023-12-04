package observerPattern;
import java.util.*;

public class MediaPage {

    public static void main(String[] args) {

        Subscriber karla = new Subscriber();
        karla.setSubscriberName("Karla");

        Subscriber janine = new Subscriber();
        janine.setSubscriberName("Janine");

        Subscriber buddy = new Subscriber();
        buddy.setSubscriberName("Buddy");

        List<Subscriber> subscriberList = new ArrayList<>();
        subscriberList.add(karla);
        subscriberList.add(janine);
        subscriberList.add(buddy);

        NewsAgency newsAgency = new NewsAgency();
        newsAgency.subscribe(karla);
        newsAgency.subscribe(janine);
        newsAgency.subscribe(buddy);

        System.out.println("\nDing!");
        newsAgency.notifySubscriber();

        newsAgency.unsubscribe(buddy);

        Subscriber yalaine = new Subscriber();
        yalaine.setSubscriberName("Yalaine");
        newsAgency.subscribe(yalaine);

        System.out.println("\nDing!");
        newsAgency.notifySubscriber();

    }

}
