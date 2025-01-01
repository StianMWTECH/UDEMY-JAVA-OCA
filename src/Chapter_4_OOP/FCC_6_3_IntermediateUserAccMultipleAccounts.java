package Chapter_4_OOP;

class BankAccountI {
    protected double balance;

    public BankAccountI(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccountI {

    public SavingsAccount(double balance) {
        super(balance);
    }

    public void applyInterest() {
        balance += balance * 0.05;
    }
}

class CheckingAccount extends BankAccountI {

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdrawal(double amount) {
        if (amount > 0 && (amount + 1) <= balance) {
            balance -= (amount + 1);
        }
    }


}

public class FCC_6_3_IntermediateUserAccMultipleAccounts {
    public static void main(String[] args) {
        BankAccountI userAccount1;

        userAccount1 = new SavingsAccount(500.10);
        System.out.println(userAccount1.getBalance());


        userAccount1.deposit(100);
        System.out.println(userAccount1.getBalance());


        if (userAccount1 instanceof SavingsAccount) {
            ((SavingsAccount) userAccount1).applyInterest();
        }
        System.out.println(userAccount1.getBalance());

        userAccount1 = new CheckingAccount(105.50);
        userAccount1.withdrawal(50);
        System.out.println(userAccount1.getBalance());
    }
}
