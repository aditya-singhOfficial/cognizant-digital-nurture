public class Main {

    public static void main(String[] args) {

        Cart cart = new Cart();

        cart.shuffleOrders();

        Order[] orderData = cart.getOrders();

        System.out.println("Original Orders");
        System.out.println("--------------------------------");
        cart.displayOrders(orderData);

        System.out.println("\nOrders After Quick Sort");
        System.out.println("--------------------------------");
        cart.quickSort(orderData, 0, orderData.length - 1);
        cart.displayOrders(orderData);

        cart.shuffleOrders();

        System.out.println("\nOrders After Bubble Sort");
        System.out.println("--------------------------------");
        cart.bubbleSort(orderData);
        cart.displayOrders(orderData);
    }
}