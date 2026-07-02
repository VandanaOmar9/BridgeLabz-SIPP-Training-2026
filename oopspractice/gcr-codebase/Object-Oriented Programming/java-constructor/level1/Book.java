class Book {
    String title, author;
    double price;

    Book() {
        title = "Java";
        author = "James";
        price = 500;
    }

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println(title + " " + author + " " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Python", "Guido", 700);

        b1.display();
        b2.display();
    }
}