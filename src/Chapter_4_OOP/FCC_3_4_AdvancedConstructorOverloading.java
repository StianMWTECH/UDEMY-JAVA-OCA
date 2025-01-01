package Chapter_4_OOP;

class BookOverload {
    String title = "unknown";
    String author = "unknown";

    public BookOverload(String title) {
        this.title = title;
    }

    public void showBookInfo() {
        System.out.println("Info: " + title + ", " + author);
    }
}

public class FCC_3_4_AdvancedConstructorOverloading {
    public static void main(String[] args) {
        BookOverload book = new BookOverload("lord of the rings");

        book.showBookInfo();
    }
}
