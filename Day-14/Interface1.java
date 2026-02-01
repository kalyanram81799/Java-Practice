interface Calc {
    void add(int a, int b);
    void sub(int a, int b);
}

class MyCalc implements Calc {
    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }
}

public class Interface1 {
    public static void main(String[] args) {
        MyCalc c = new MyCalc();
        c.add(10, 5);
        c.sub(10, 5);
    }
}
