package observer;

public class StockPlay {
    public static void main(String[] args){
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);
        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(197.99);
        stockGrabber.setIbmPrice(198.99);
        stockGrabber.setIbmPrice(199.99);
    }
}
