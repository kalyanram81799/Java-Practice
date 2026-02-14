public class ExceptionPropagationDemo {

    static void m1() {
        m2();
    }

    static void m2() {
        m3();
    }

    static void m3() {
        int x = 10 / 0;
    }

    public static void main(String[] args) {

        try {
            m1();
        }
        catch (ArithmeticException e) {
            System.out.println("Exception handled in main");
        }
    }
}
