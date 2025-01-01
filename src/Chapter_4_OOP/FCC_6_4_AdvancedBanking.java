package Chapter_4_OOP;

interface Transactionable {
    double getBalance();
    void deposit (double amount);
    void withdrawal(double amount);
}

abstract class BankingAcc implements Transactionable {
    protected double balance;

    public BankingAcc(double balance) {
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

    abstract void applyInterestOrFee();
}

class SavingsAcc extends BankingAcc {

    public SavingsAcc(double balance) {
        super(balance);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    void applyInterestOrFee() {
        balance += balance * 0.05;
    }
}

class CheckingAcc extends BankingAcc {

    public CheckingAcc(double balance) {
        super(balance);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    void applyInterestOrFee() {
        if (balance > 0) {
            balance -= 1;
        }
    }
}

class FixedDepositAccount extends BankingAcc {

    protected boolean isMature = false;

    public FixedDepositAccount(double balance) {
        super(balance);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    void applyInterestOrFee() {
        if (isMature) {
            balance += balance * 0.07;
        } else {
            System.out.println("No interest added: Not Mature yet");
        }
    }

    @Override
    public void withdrawal(double amount) {
        if (isMature) {
            super.withdrawal(amount);
        } else {
            System.out.println("No withdrawal made: Not Mature yet");
        }
    }

    public void setMature(boolean mature) {
        this.isMature = mature;
    }
}

class TransactionManager {


    public void transfer(Transactionable fromAcc, Transactionable toAcc, double amount) {
        if (fromAcc != null && fromAcc.getBalance() >= amount) {
            fromAcc.withdrawal(amount);
            toAcc.deposit(amount);
            logTransaction("transfer", amount, fromAcc, toAcc);
        } else {
            System.out.println("Transfer not made due to insufficient funds");
        }
    }

    public void logTransaction(String type, double amount, Transactionable fromAcc, Transactionable toAcc) {
        System.out.println(type + " of " + amount + " from " + fromAcc.getBalance() + " to " + toAcc.getBalance());
    }
}

public class FCC_6_4_AdvancedBanking {

    public static void main(String[] args) {

        BankingAcc newAcc;
        BankingAcc oldAcc;
        BankingAcc fixedAcc;
        TransactionManager manager = new TransactionManager();

        fixedAcc = new FixedDepositAccount(100.75);

        fixedAcc.applyInterestOrFee();
        ((FixedDepositAccount) fixedAcc).setMature(true);
        fixedAcc.withdrawal(50.75);
        System.out.println(fixedAcc.getBalance());

        newAcc = new SavingsAcc(100.50);
        oldAcc = new CheckingAcc(200.20);
        System.out.println("old account: " + oldAcc.getBalance());
        System.out.println("new account: " + newAcc.getBalance());

        manager.transfer(newAcc, oldAcc, 50.05);
        System.out.println("old account: " + oldAcc.getBalance());
        System.out.println("new account: " + newAcc.getBalance());
    }
}
