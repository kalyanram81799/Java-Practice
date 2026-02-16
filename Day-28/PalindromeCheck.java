public class PalindromeCheck {
    public static void main(String[] args) {
        String str1 = "madam";
        String rev = new StringBuilder(str1).reverse().toString();
        if (str1.equals(rev)) {
            System.out.println("the given stirng " + str1 + " is a palindrome");
        } else {
            System.out.println("the given stirng " + str1 + "is not a palindrome");
        }
    }

}
