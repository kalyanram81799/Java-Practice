public class StaticNested {
    static String country = "India";

    static class Phone {
        void details() {
            System.out.println("Country: " + country);
        }
    }

    public static void main(String[] args) {
        StaticNested.Phone ph = new StaticNested.Phone();
        ph.details();
    }
}
