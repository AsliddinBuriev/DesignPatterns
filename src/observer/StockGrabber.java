package observer;

import java.util.ArrayList;
import java.util.HashSet;

public class StockGrabber implements Subject{
    private HashSet<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    StockGrabber() {
        observers = new HashSet<Observer>();
    }

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for(Observer observer : observers) {
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setAaplPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObserver();
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObserver();
    }
}
