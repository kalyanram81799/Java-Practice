public class StringSplitDemo {
    public static void main(String[] args) {
        String data = "apple,banana,orange,grapes,watermelon";
        String str[] = data.split(",");
        for (String s : str) {
            System.out.println(s);
        }
    }
}
