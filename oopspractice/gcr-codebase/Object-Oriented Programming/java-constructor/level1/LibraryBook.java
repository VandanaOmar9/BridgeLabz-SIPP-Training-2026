class LibraryBook {
    String title, author;
    double price;
    boolean available;

    LibraryBook(String t, String a, double p, boolean av) {
        title = t;
        author = a;
        price = p;
        available = av;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book Borrowed");
        } else {
            System.out.println("Book Not Available");
        }
    }

    public static void main(String[] args) {
        LibraryBook b = new LibraryBook("Java", "James", 500, true);

        b.borrowBook();
    }
}