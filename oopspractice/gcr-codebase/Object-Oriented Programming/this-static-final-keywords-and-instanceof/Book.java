class Book {
    static String libraryName = "Central Library";
    String title, author;
    final int isbn;

    Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println(libraryName);
    }

    public static void main(String[] args) {
        Book b = new Book("Java", "James", 1001);
        if (b instanceof Book)
            System.out.println(b.title + " " + b.author + " " + b.isbn);
        displayLibraryName();
    }
}