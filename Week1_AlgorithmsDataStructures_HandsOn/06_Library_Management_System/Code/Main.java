public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        library.displayBooks();

        System.out.println("\nSearching Using Linear Search");
        System.out.println("-----------------------------");
        library.linearSearch(104);

        System.out.println("\nSearching Using Binary Search");
        System.out.println("-----------------------------");
        library.binarySearch(103);
    }
}