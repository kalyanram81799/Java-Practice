interface Printer {
    default void print() {
        System.out.println("Default Print");
    }
}

class Canon implements Printer {
    public void print() {
        System.out.println("Canon Print");
    }
}

public class OverrideDefault {
    public static void main(String[] args) {
        Printer p = new Canon();
        p.print();
    }
}
