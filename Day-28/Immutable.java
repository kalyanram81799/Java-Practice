public class Immutable {
    public static void main(String[] args) {
        String str1 = "hello ";
        System.out.println(str1.concat("world"));
        System.out.println("the string str1 is " + str1);
        String str2 = new String("hello");
        System.out.println(str2.concat("world"));
        System.out.println("the string is str2 " + str2);
    }
}
