public class BothDemo {

    static void checkNumber(int n) throws Exception {
        if (n < 0) {
            throw new Exception("Negative number not allowed");
        }
        System.out.println("Valid number");
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
