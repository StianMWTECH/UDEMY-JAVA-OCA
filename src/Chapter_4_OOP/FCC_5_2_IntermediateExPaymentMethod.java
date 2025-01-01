package Chapter_4_OOP;

abstract class PaymentMethod {
    abstract void pay(double amount);
}

class CreditCard extends PaymentMethod {
    @Override
    void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card");
    }
}

class PayPal extends PaymentMethod {
    @Override
    void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal");
    }
}

// Demonstrates polymorphism by treating both CCard and PPal as PaymentMethod
public class FCC_5_2_IntermediateExPaymentMethod {

    public static void main(String[] args) {
        PaymentMethod p;

        p = new CreditCard();
        p.pay(100.50);

        p = new PayPal();
        p.pay(200.75);
    }
}
