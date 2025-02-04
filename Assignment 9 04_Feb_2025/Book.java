class Book {
    private static String libraryName = "City Library";
    private final String isbn;
    private String title;
    private String author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Premchand ke phate joote", "Harishankar Parsai", "123456");
        Book book2 = new Book("Godaan", "Premchand", "789101");

        displayLibraryName();
        book1.displayDetails();
        book2.displayDetails();
    }
}
