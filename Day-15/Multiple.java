interface Bank {
    int getInterest();
}

class SBI implements Bank {
    public int getInterest() {
        return 7;
    }
}

class HDFC implements Bank {
    public int getInterest() {
        return 9;
    }
}

public class Multiple {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        System.out.println(b1.getInterest());

        Bank b2 = new HDFC();
        System.out.println(b2.getInterest());
    }
}
