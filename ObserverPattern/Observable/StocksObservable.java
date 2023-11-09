package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {
    public void addObserver(NotificationAlertObserver observer);
    public void removeObserver(NotificationAlertObserver observer);
    public int getStockCount();
    public void setStockCount(int newStockAdded);
    public void notifySubscribers();
}
