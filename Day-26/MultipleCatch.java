import java.util.Scanner;

class Demo {
    void show(int a[], int b, int c) {
        try {
            System.out.println("The array elements are:");

            // Intentionally causing ArrayIndexOutOfBoundsException
            int result = b / c;
            for (int i = 0; i <= a.length; i++) {
                System.out.println(a[i]);
            }

            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be zero!");
        } catch (Exception e) {
            System.out.println(" MAin Exception ");
        }
    }
}

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n value:");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter b and c values:");
        int b = sc.nextInt();
        int c = sc.nextInt();

        Demo obj = new Demo();
        obj.show(a, b, c);
    }
}
