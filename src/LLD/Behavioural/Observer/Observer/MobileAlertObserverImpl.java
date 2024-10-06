package LLD.Behavioural.Observer.Observer;

import LLD.Behavioural.Observer.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String username;
    StockObservable observable;

    public MobileAlertObserverImpl(String username, StockObservable observable){
        this.username = username;
        this.observable = observable;
    }

    @Override
    public void update() {
        SendMsgMobile(username,"product is in stock hurry up !!");
    }

    private void SendMsgMobile(String username, String msg){
        System.out.println("message send to " + username);
    }
}
