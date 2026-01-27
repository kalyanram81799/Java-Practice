class StaticBank {
    static float interestRate = 7.5f;

    int balance;

    StaticBank(int balance) {
        this.balance = balance;
    }

    void calculateInterest() {
        System.out.println(balance * interestRate / 100);
    }

    public static void main(String[] args) {
        StaticBank b1 = new StaticBank(10000);
        StaticBank b2 = new StaticBank(20000);

        b1.calculateInterest();
        b2.calculateInterest();
    }
}
