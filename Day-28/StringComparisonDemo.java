public class StringComparisonDemo {
    public static void main(String[] args) {

        String a = "Java";
        String b = new String("Java");

        if (a.equals(b)) {
            System.out.println("Contents are equal");
        }

        if (a == b) {
            System.out.println("References equal");
        } else {
            System.out.println("References not equal");
        }
    }
}
