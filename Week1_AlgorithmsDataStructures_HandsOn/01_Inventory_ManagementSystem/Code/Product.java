public class Product {

    private int id;
    private String name;
    private int stock;
    private int cost;

    public Product(int id, String name, int stock, int cost) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "ID=" + id +
                ", Name=" + name +
                ", Stock=" + stock +
                ", Cost=" + cost;
    }
}