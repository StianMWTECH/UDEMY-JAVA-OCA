package Chapter_4_OOP;

class CookieCutter {
    String shape;

    public CookieCutter(String shape) {
        this.shape = shape;
    }

    public Cookie makeCookie(String flavor) {
        return new Cookie(this.shape, flavor);
    }
}

class Cookie {
    String shape;
    String flavor;

    public Cookie(String shape, String flavor) {
        this.shape = shape;
        this.flavor = flavor;
    }

    public void describeCookie() {
        System.out.println(flavor + ", " + shape);
    }
}

public class FCC_1_CookieFactory {

    public static void main(String[] args) {
        CookieCutter heartCookie = new CookieCutter("heart");

        Cookie chocHeartCookie = heartCookie.makeCookie("chocolate");

        chocHeartCookie.describeCookie();
    }
}
