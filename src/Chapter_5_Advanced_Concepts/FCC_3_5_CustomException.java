package Chapter_5_Advanced_Concepts;

// Custom exception class
class InvalidWithdrawalAmountException extends Exception {
    public InvalidWithdrawalAmountException(String message) {
        super(message);  // Passing the error message to the base Exception class
    }
}

public class FCC_3_5_CustomException {

    private double balance;

    public FCC_3_5_CustomException(double balance) {
        this.balance = balance;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) throws InvalidWithdrawalAmountException1 {
        if (amount < 0) {
            throw new InvalidWithdrawalAmountException1("Withdrawal amount cannot be negative.");
        } else if (amount > balance) {
            throw new InvalidWithdrawalAmountException1("Withdrawal amount exceeds account balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }

    public static void main(String[] args) {
        FCC_3_5_CustomException account = new FCC_3_5_CustomException(500);

        try {
            account.withdraw(600);  // This should trigger our custom exception
        } catch (InvalidWithdrawalAmountException1 e) {
            System.out.println("Error: " + e.getMessage());  // Handle the custom exception by printing out the error message
        } catch (Exception e) {  // This catch block will handle general exceptions
            System.out.println("A general error occurred: " + e.getMessage());
        }
    }
}