package LLD.Behavioural.Observer.Observable;

import LLD.Behavioural.Observer.Observer.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver obj);

    public void remove(NotificationAlertObserver obj);

    public void notifySubscribers();

    public void setStockCount(int newStcockCount);

    public int getCount();


}
