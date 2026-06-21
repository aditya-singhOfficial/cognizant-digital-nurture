import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {

    private List<Observer> subscriberList;
    private String companyName;
    private double currentPrice;

    public StockMarket(String companyName, double currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        subscriberList = new ArrayList<>();
    }

    public void setStockPrice(double currentPrice) {
        this.currentPrice = currentPrice;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscriberList) {
            observer.update(companyName, currentPrice);
        }
    }

    @Override
    public void register(Observer observer) {
        subscriberList.add(observer);
    }

    @Override
    public void deregister(Observer observer) {
        subscriberList.remove(observer);
    }
}