public class Library {

    private Book[] books = {
            new Book(101, "Clean Code", "Robert Martin"),
            new Book(102, "Effective Java", "Joshua Bloch"),
            new Book(103, "Design Patterns", "GoF"),
            new Book(104, "Computer Networks", "Andrew Tanenbaum")
    };

    public void displayBooks() {

        System.out.println("Available Books");
        System.out.println("-------------------------");

        for (Book currentBook : books) {
            System.out.println(currentBook);
        }
    }

    public void linearSearch(int bookId) {

        for (Book currentBook : books) {

            if (currentBook.getId() == bookId) {
                System.out.println(currentBook);
                return;
            }
        }

        System.out.println("Requested book not available.");
    }

    public void binarySearch(int bookId) {

        int left = 0;
        int right = books.length - 1;

        while (left <= right) {

            int middle = left + (right - left) / 2;

            if (books[middle].getId() == bookId) {
                System.out.println(books[middle]);
                return;
            }

            if (bookId < books[middle].getId()) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        System.out.println("Requested book not available.");
    }
}