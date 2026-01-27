public class AutoBoxingDemo {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a;  // Autoboxing
        int c = b;      // Unboxing
        System.out.println(a + " " + b + " " + c);
    }
}
