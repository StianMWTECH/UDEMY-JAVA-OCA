package Chapter_4_OOP;

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void showBookInfo() {
        System.out.println("Info: " + title + ", " + author);
    }
}

public class FCC_3_1_Basic_SimpleClass {

    public static void main(String[] args) {
        Book bookdetails = new Book("lord of the rings", "tolkien");

        bookdetails.showBookInfo();
    }

}
