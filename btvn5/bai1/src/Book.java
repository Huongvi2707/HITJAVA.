public class Book {
    private static int autoId = 1;
    private int bookId;
    private String title;
    private String author;
    private double price;
    private Publisher publisher;

    public Book(String title, String author, double price, Publisher publisher) {
        this.bookId = bookId++;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }

    public Book(String tilte, String author, double price) {
        this.bookId = bookId++;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = new Publisher(" Unknown ", "Unknown");
    }
    public void displayInfor(){
        System.out.println("ID: " + bookId + ", Title: " + title +
                ", Author: " + author + ", Price: " + price);
    }
    public void displayInfo(boolean showPublisher){
        displayInfor();
        if (showPublisher) {
            System.out.println(publisher);
        } else {
            System.out.println("Publisher: Unknown");
        }
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Book.autoId = autoId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
    public Book(){

    }
}
