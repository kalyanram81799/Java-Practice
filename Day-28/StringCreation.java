public class StringCreation {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "java";
        System.out.println("Value :" + (str1 == str2));
        System.out.println("VAlue :" + str1.equals(str2));
        String str3 = new String("java");
        System.out.println("Value :" + (str1 == str3));
        System.out.println("VAlue :" + str1.equals(str3));

    }
}