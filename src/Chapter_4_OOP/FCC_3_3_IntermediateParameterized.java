package Chapter_4_OOP;

class BookParam {
    String title;
    String author;

    public BookParam() {
        title = "unknown";
        author = "unknown";
    }

    public BookParam(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void showBookInfo() {
        System.out.println("Info: " + title + ", " + author);
    }
}

public class FCC_3_3_IntermediateParameterized {
    public static void main(String[] args) {
        BookParam bookdetails = new BookParam("lord of the rings", "tolkien");

        bookdetails.showBookInfo();
    }
}
