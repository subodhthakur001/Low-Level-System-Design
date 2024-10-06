package LLD.Behavioural.Observer.Observer;

import LLD.Behavioural.Observer.Observable.StockObservable;

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
