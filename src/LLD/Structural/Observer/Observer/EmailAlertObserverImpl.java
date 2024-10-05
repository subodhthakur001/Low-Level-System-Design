package LLD.Structural.Observer.Observer;

import LLD.Structural.Observer.Observable.StockObservable;

import java.util.EnumMap;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String EmailId;
    StockObservable stockObservable;

    public EmailAlertObserverImpl(String EmailId,StockObservable stockObservable){
        this.EmailId = EmailId;
        this.stockObservable = stockObservable;
    }
    @Override
    public void update() {
        SendMail(EmailId, "product is in stock hurry up");
    }

    private void SendMail(String emailId , String message){
        System.out.println("mail send to " + emailId);
    }
}
