package LLD.Structural.Observer.Observable;

import LLD.Structural.Observer.Observer.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver obj);

    public void remove(NotificationAlertObserver obj);

    public void notifySubscribers();

    public void setStockCount(int newStcockCount);

    public int getCount();


}
