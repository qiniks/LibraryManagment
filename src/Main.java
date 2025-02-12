class Book {
    protected String title;
    protected String author;
    protected int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getBookInfo() {
        return "Title: " + title + "\nAuthor: " + author + "\nYear Published: " + yearPublished;
    }

    public void printBookDetails() {
        System.out.println(getBookInfo());
    }
}

class PrintedBook extends Book {
    private int numberOfPages;
    private String publisher;
    private double price;

    public PrintedBook(String title, String author, int yearPublished, int numberOfPages, String publisher, double price) {
        super(title, author, yearPublished);
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
        this.price = price;
    }

    public PrintedBook(String title, String author, int yearPublished, int numberOfPages, double price) {
        super(title, author, yearPublished);
        this.numberOfPages = numberOfPages;
        this.publisher = "Unknown";
        this.price = price;
    }

    public String getBookInfo() {
        return super.getBookInfo() +
                "\nNumber of pages: " + numberOfPages +
                "\nPublisher: " + publisher +
                "\nPrice: " + price;
    }


    public void printBookDetails() {
        System.out.println("*** Printed Book Details ***");
        System.out.println(getBookInfo());
    }

    public void bookType() {
        System.out.println("This is a printed book.");
    }

    public void printBook() {
        System.out.println("Printing the book...");
    }
}

class EBook extends Book {
    private double fileSizeMB;
    private String fileFormat;
    private double price;

    public EBook(String title, String author, int yearPublished, double fileSizeMB, String fileFormat, double price) {
        super(title, author, yearPublished);
        this.fileSizeMB = fileSizeMB;
        this.fileFormat = fileFormat;
        this.price = price;
    }

    public EBook(String title, String author, int yearPublished, double fileSizeMB, double price) {
        super(title, author, yearPublished);
        this.fileSizeMB = fileSizeMB;
        this.fileFormat = "Unknown";
        this.price = price;
    }


    public String getBookInfo() {
        return super.getBookInfo() +
                "\nFile size: " + fileSizeMB +
                "\nFile format: " + fileFormat +
                "\nPrice: " + price;
    }


    public void printBookDetails() {
        System.out.println("*** EBook Details ***");
        System.out.println(getBookInfo());
    }

    public void bookType() {
        System.out.println("This is an ebook.");
    }
}

public class Main {
    public static void main(String[] args) {
        PrintedBook printedBook = new PrintedBook("Манас", "Сагымбай Орозбаков", 1925, 180, "Санат", 600);
        EBook ebook = new EBook("Жамиля", "Чыңгыз Айтматов", 1949, 2.5, "PDF", 500);

        System.out.println("*** Printed Book Info ***");
        System.out.println(printedBook.getBookInfo());
        System.out.println();
        printedBook.printBookDetails();
        System.out.println();
        printedBook.bookType();
        System.out.println();
        printedBook.printBook();
        System.out.println();
        System.out.println("*** EBook Info ***");
        System.out.println();
        System.out.println(ebook.getBookInfo());
        System.out.println();
        ebook.printBookDetails();
        System.out.println();
        ebook.bookType();
    }
}