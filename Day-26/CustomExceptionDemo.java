class InvalidAmountException extends Exception {

    InvalidAmountException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    static void withdraw(int amount) throws InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException("Invalid withdrawal amount");
        }

        System.out.println("Withdrawal successful");
    }

    public static void main(String[] args) {

        try {
            withdraw(-500);
        }
        catch (InvalidAmountException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}
