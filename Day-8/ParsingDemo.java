public class ParsingDemo {
    public static void main(String[] args) {
        String s = "123";
        int x = Integer.parseInt(s);
        Integer y = Integer.valueOf(s);
        System.out.println(x + y);
    }
}
