package observer;

public class StockObserver implements Observer {
    private double ibmPrice;
    private double applePrice;
    private double googPrice;

    private static int observerIdTracker = 0;

    private int observerId;

    private StockGrabber stockGrabber;

    public StockObserver(StockGrabber stockGrabber) {
        observerId = ++observerIdTracker;
        this.stockGrabber = stockGrabber;
        stockGrabber.register(this);
    }

    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.applePrice = aaplPrice;
        this.googPrice = googPrice;
        printPrice();
    }

    public void printPrice(){
        System.out.println(
                        observerId + ":\n"
                        + "IBM PRICE: " + ibmPrice
                        + "\n" + "APPLE PRICE: " + applePrice
                        + "\n" + "GOOG PRICE: " + googPrice +"\n"
        );
    }
}
