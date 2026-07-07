// Superclass
class Book {
    private String title;
    private int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getPublicationYear() { return publicationYear; }
    public void setPublicationYear(int publicationYear) { this.publicationYear = publicationYear; }

    public void displayInfo() {
        System.out.println("Title            : " + title);
        System.out.println("Publication Year : " + publicationYear);
    }
}

// Subclass - inherits from Book
class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getBio() { return bio; }
    public void setBio(String bio) { this.bio = bio; }

    // Overriding to include author details along with book details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name      : " + name);
        System.out.println("Author Bio       : " + bio);
        System.out.println("-----------------------------------");
    }
}

public class LibraryBookAuthorSystem {
    public static void main(String[] args) {
        Author author1 = new Author("The Alchemist", 1988, "Paulo Coelho", "Brazilian novelist known for inspirational fiction.");
        Author author2 = new Author("A Brief History of Time", 1988, "Stephen Hawking", "Theoretical physicist and author of popular science books.");

        System.out.println("=== Book 1 with Author Details ===");
        author1.displayInfo();

        System.out.println("=== Book 2 with Author Details ===");
        author2.displayInfo();
    }
}