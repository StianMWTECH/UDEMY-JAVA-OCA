package Chapter_4_OOP;

class BookDefault {
    String title;
    String author;

    public BookDefault() {
        title = "unknown";
        author = "unknown";
    }

//    public BookDefault(String title, String author) {
//        this.title = title;
//        this.author = author;
//    }

    public void showBookInfo() {
        System.out.println("Info: " + title + ", " + author);
    }
}

public class FCC_3_2_IntermediateDefaultConstructors {
    public static void main(String[] args) {
        BookDefault bookdetails2 = new BookDefault();

        bookdetails2.showBookInfo();
    }
}
