public class Main {

    public static void main(String[] args) {

        Shop store = new Shop();
        store.storeProducts();

        int index;
        long startTime;
        long endTime;

        System.out.println("Using Linear Search");

        startTime = System.nanoTime();
        index = store.linearSearch(8);
        endTime = System.nanoTime();

        store.displayProduct(index);
        System.out.println("Execution Time : " + (endTime - startTime) + " ns");

        System.out.println("\n====================================\n");

        System.out.println("Using Binary Search");

        startTime = System.nanoTime();
        index = store.binarySearch(8);
        endTime = System.nanoTime();

        store.displayProduct(index);
        System.out.println("Execution Time : " + (endTime - startTime) + " ns");
    }
}