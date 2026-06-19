import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {

    private final List<Product> items = new ArrayList<>();

    public void addProduct(Product item) {
        items.add(item);
        System.out.println("Item added.");
    }

    public void updateProduct(Product updatedItem) {

        for (Product currentItem : items) {

            if (currentItem.getId() == updatedItem.getId()) {

                currentItem.setName(updatedItem.getName());
                currentItem.setStock(updatedItem.getStock());
                currentItem.setCost(updatedItem.getCost());

                System.out.println("Item updated.");
                return;
            }
        }

        System.out.println("Item not found.");
    }

    public void removeProduct(int id) {

        Iterator<Product> iterator = items.iterator();

        while (iterator.hasNext()) {

            Product item = iterator.next();

            if (item.getId() == id) {
                iterator.remove();
                System.out.println("Item deleted.");
                return;
            }
        }

        System.out.println("Item not found.");
    }

    public void displayProduct() {

        for (Product item : items) {
            System.out.println(item);
        }
    }
}