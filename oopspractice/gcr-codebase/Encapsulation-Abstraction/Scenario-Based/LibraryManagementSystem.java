abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() { return itemId; }
    public void setItemId(String itemId) { this.itemId = itemId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public abstract int getLoanDuration();

    public void displayItemDetails() {
        System.out.println("Item ID       : " + itemId);
        System.out.println("Title         : " + title);
        System.out.println("Author        : " + author);
        System.out.println("Loan Duration : " + getLoanDuration() + " days");
        System.out.println("-----------------------------------");
    }
}

class Book extends LibraryItem {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }
}

class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 3;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem book = new Book("B101", "The Alchemist", "Paulo Coelho");
        LibraryItem magazine = new Magazine("M201", "National Geographic", "Various Authors");
        LibraryItem dvd = new DVD("D301", "Inception", "Christopher Nolan");

        System.out.println("=== Book ===");
        book.displayItemDetails();

        System.out.println("=== Magazine ===");
        magazine.displayItemDetails();

        System.out.println("=== DVD ===");
        dvd.displayItemDetails();
    }
}