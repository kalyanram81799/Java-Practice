public class StringBuilderReverseDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java");
        StringBuilder sb1 = new StringBuilder();
        System.out.println("the reversed string is :" + sb.reverse());
        String s1 = "Course";
        System.out.println("the reversed string is :" + new StringBuilder(s1).reverse());
    }
}
