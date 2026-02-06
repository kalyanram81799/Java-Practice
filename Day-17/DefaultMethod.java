interface Printer {
    default void print() {
        System.out.println("Printing...");
    }
}

class HP implements Printer {
}

public class DefaultMethod {
    public static void main(String[] args) {
        HP h = new HP();
        h.print();
    }
}
