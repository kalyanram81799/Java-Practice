import java.util.Scanner;

class Nullp {
    String str;

    void show(String str) {
        try {
            this.str = str;
            System.out.println("the length of string is " + str.length());
        } catch (NullPointerException e) {
            System.out.println("entered string is null hero !");
        }
    }
}

public class NullPointer {
    public static void main(String[] args) {
        // System.out.println("enter string value");
        // Scanner sc = new Scanner(System.in);
        String str = null;
        Nullp n = new Nullp();
        n.show(str);
    }

}
