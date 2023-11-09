package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserver implements NotificationAlertObserver{
    String userName;
    StocksObservable observable;

    public MobileAlertObserver(String userName, StocksObservable observable){
        this.userName = userName;
        this.observable = observable;
    }
    @Override
    public void update(){
        sendMessageOnMobile(userName, "product in stock!");
    }

    private void sendMessageOnMobile(String userName, String message) {
        System.out.println(("Message sent to" + userName));
    }
}