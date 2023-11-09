package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;
public class IphoneObservableImpl implements StocksObservable{
    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;
    @Override
    public void addObserver(NotificationAlertObserver observer){ observerList.add(observer); }

    @Override
    public void removeObserver(NotificationAlertObserver observer){ observerList.remove(observer); }

    @Override
    public void notifySubscribers(){
        for(NotificationAlertObserver observer: observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded){
        if(stockCount == 0) notifySubscribers();
        stockCount += newStockAdded;
    }

    @Override
    public int getStockCount(){
        return stockCount;
    }

}
