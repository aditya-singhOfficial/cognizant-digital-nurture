public class Main {

    public static void main(String[] args) {

        StockMarket stock = new StockMarket("TCS", 3500.0);

        MobileApp mobileUser = new MobileApp("Aditya's Mobile");
        WebApp webUser = new WebApp("Trading Dashboard");

        stock.register(mobileUser);
        stock.register(webUser);

        System.out.println("Updating stock value...");
        stock.setStockPrice(3575.0);

        stock.deregister(mobileUser);

        System.out.println();

        System.out.println("Updating stock value...");
        stock.setStockPrice(3650.0);
    }
}