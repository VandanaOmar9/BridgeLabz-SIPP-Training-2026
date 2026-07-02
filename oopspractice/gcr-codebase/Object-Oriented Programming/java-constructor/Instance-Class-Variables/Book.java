class Book {
    public int ISBN;
    protected String title;
    private String author;

    Book() {
        ISBN = 101;
        title = "Java";
        author = "James";
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {

    public static void main(String[] args) {
        EBook b = new EBook();
        System.out.println(b.ISBN);
        System.out.println(b.title);
        System.out.println(b.getAuthor());
    }
}