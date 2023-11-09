package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver{
    String emailId;
    StocksObservable observable;

    public EmailAlertObserver(String emailId, StocksObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }
    @Override
    public void update(){
        sendMail(emailId, "product in stock!");
    }

    private void sendMail(String emailId, String message) {
        System.out.println(("email sent to" + emailId));
    }
}
