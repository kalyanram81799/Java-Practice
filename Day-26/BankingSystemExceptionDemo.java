class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {

    private int balance = 5000;

    public void withdraw(int amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance");
        }

        balance -= amount;
        System.out.println("Withdrawal Successful. Remaining Balance: " + balance);
    }
}

public class BankingSystemExceptionDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        try {
            account.withdraw(7000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        }
    }
}
