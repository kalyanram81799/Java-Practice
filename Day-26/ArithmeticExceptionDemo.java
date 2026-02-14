import java.util.*;

class Demo {
    Scanner sc = new Scanner(System.in);

    void details(int a, int b) {
        try {
            System.out.println("using try and catch block");
            int r = a / b;
            System.out.println("There is no error and value is " + r);
        } catch (ArithmeticException e) {
            System.out.println("Please enter a non zero denominator");
            b = sc.nextInt();
            this.details(a, b);
        }
    }
}

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Demo obj = new Demo();
        System.out.println("enter numerator :\n");
        int a = s.nextInt();
        System.out.println("enter Denominator :\n");
        int b = s.nextInt();
        obj.details(a, b);

    }
}