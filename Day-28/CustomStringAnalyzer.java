public class CustomStringAnalyzer {
    public static void main(String[] args) {

        String s = "Java123Programming";

        int letters = 0;
        int digits = 0;

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                letters++;
            } else if (Character.isDigit(c)) {
                digits++;
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
    }
}
