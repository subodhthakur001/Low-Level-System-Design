package LLD.Behavioural.Observer.Observable;

import LLD.Behavioural.Observer.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{
    List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stockCount = 0;


    @Override
    public void add(NotificationAlertObserver obj) {
        observerList.add(obj);
    }

    @Override
    public void remove(NotificationAlertObserver obj) {
        observerList.remove(obj);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer : observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStcockCount) {
        if(stockCount == 0){
            notifySubscribers();
        }
        stockCount = stockCount + newStcockCount;
    }

    @Override
    public int getCount() {
        return stockCount;
    }
}
