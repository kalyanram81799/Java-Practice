public class VariableDemo {
    public static void main(String[] args) {

        int x = 10;
            //  x=20;
        Runnable r = () -> {
            System.out.println(x);
        };
            // x=30;
        r.run();
    }
}
