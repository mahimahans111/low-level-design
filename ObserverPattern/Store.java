package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observer.EmailAlertObserver;
import ObserverPattern.Observer.MobileAlertObserver;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args){
        StocksObservable iPhoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserver("mahi@gmail.com", iPhoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("vanshi@gmail.com", iPhoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserver("mahii", iPhoneStockObservable);

        iPhoneStockObservable.addObserver(observer1);
        iPhoneStockObservable.addObserver(observer2);
        iPhoneStockObservable.addObserver(observer3);

        iPhoneStockObservable.setStockCount(10);
    }
}
