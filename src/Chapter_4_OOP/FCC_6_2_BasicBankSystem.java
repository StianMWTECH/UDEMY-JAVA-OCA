package Chapter_4_OOP;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        if (balance > 0) {
            this.balance = balance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Too poor");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount >= balance) {
            balance -= amount;
        } else {
            System.out.println("Nice try");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class FCC_6_2_BasicBankSystem {
    public static void main(String[] args) {
        BankAccount absaAcc1 = new BankAccount(100.50);

        absaAcc1.deposit(10.4);
        absaAcc1.withdraw(20);
        System.out.println(absaAcc1.getBalance());
    }
}
