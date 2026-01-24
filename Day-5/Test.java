
public class Test {

    void add(int a, int b, double c) {
        System.out.println("int int double");
    }

    void add(double a, double b, double c) {
        System.out.println("double double double");
    }
    void add(int a, double b, double c) {
        System.out.println("int  double double");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.add(10, 20, 30);
    }
}
