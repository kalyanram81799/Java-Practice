public class FinallyBlockDemo {

    public static void main(String[] args) {

        try {
            int x = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Handled Exception");
        }
        finally {
            System.out.println("Finally Block Always Executes");
        }
    }
}
