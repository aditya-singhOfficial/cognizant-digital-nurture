public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addProduct(new Product(101, "Monitor", 50, 12000));
        inventory.addProduct(new Product(102, "Headphones", 120, 1500));
        inventory.addProduct(new Product(103, "Webcam", 40, 2200));
        inventory.addProduct(new Product(104, "Speaker", 70, 1800));
        inventory.addProduct(new Product(105, "SSD", 25, 4500));

        System.out.println("\nCurrent Inventory");
        inventory.displayProduct();

        System.out.println("\nUpdating Product...\n");
        inventory.updateProduct(
                new Product(105, "Gaming SSD", 30, 5500));

        inventory.displayProduct();

        System.out.println("\nRemoving Product...\n");
        inventory.removeProduct(105);

        inventory.displayProduct();
    }
}