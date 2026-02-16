public class StringMethods {
    public static void main(String[] args) {
        String str1 = "java";
        System.out.println(str1.hashCode());
        System.out.println(str1.chars());
        System.out.println(str1.charAt(3));
        System.out.println(str1.concat("core"));
        System.out.println(str1.compareTo("Java"));
        System.out.println(str1.equalsIgnoreCase("JAVA"));
        System.out.println(str1.endsWith("a"));
        System.out.println(str1.replace('j', 'J'));
        System.out.println(str1.getBytes());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.split("v", 3));

    }
}
