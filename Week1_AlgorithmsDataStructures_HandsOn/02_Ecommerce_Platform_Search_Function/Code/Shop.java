public class Shop {

    private Product[] products = new Product[10];

    public void storeProducts() {

        String[][] data = {
                { "Phone", "Electronics" },
                { "Laptop", "Electronics" },
                { "Shirt", "Fashion" },
                { "Shoes", "Fashion" },
                { "Stove", "Kitchen" },
                { "Bat", "Sports" },
                { "Football", "Sports" },
                { "Maida", "Grocery" },
                { "Kadalai", "Grocery" },
                { "Fan", "Electronics" }
        };

        for (int i = 0; i < data.length; i++) {
            products[i] = new Product(i + 1, data[i][0], data[i][1]);
        }
    }

    public int linearSearch(int targetId) {

        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductId() == targetId) {
                return i;
            }
        }

        return -1;
    }

    public int binarySearch(int targetId) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int middle = left + (right - left) / 2;
            int currentId = products[middle].getProductId();

            if (currentId == targetId) {
                return middle;
            }

            if (targetId < currentId) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return -1;
    }

    public void displayProduct(int index) {

        if (index < 0) {
            System.out.println("Product not available.");
            return;
        }

        Product item = products[index];

        System.out.println("Product Details");
        System.out.println("----------------");
        System.out.println("Name     : " + item.getProductName());
        System.out.println("Category : " + item.getCategory());
    }
}