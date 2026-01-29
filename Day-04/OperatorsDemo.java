public class OperatorsDemo {

    public static void main(String[] args) {

        System.out.println("===== 1. ARITHMETIC OPERATORS =====");
        int a = 10, b = 3;

        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division (int division)
        System.out.println("a % b = " + (a % b)); // Modulus (remainder)

        System.out.println("\n===== 2. UNARY OPERATORS =====");
        int x = 5;

        System.out.println("x = " + x);
        System.out.println("++x = " + (++x)); // Pre-increment
        System.out.println("x++ = " + (x++)); // Post-increment
        System.out.println("x after x++ = " + x);

        System.out.println("--x = " + (--x)); // Pre-decrement
        System.out.println("x-- = " + (x--)); // Post-decrement
        System.out.println("x after x-- = " + x);

        System.out.println("Unary minus = " + (-x));
        System.out.println("Unary plus = " + (+x));

        System.out.println("\n===== 3. RELATIONAL (COMPARISON) OPERATORS =====");
        int p = 10, q = 20;

        System.out.println("p == q : " + (p == q));
        System.out.println("p != q : " + (p != q));
        System.out.println("p > q  : " + (p > q));
        System.out.println("p < q  : " + (p < q));
        System.out.println("p >= q : " + (p >= q));
        System.out.println("p <= q : " + (p <= q));

        System.out.println("\n===== 4. LOGICAL OPERATORS =====");
        boolean c1 = true;
        boolean c2 = false;

        System.out.println("c1 && c2 : " + (c1 && c2)); // AND
        System.out.println("c1 || c2 : " + (c1 || c2)); // OR
        System.out.println("!c1      : " + (!c1));      // NOT

        System.out.println("\n===== 5. ASSIGNMENT OPERATORS =====");
        int n = 10;

        n += 5;  // n = n + 5
        System.out.println("n += 5  -> " + n);

        n -= 3;
        System.out.println("n -= 3  -> " + n);

        n *= 2;
        System.out.println("n *= 2  -> " + n);

        n /= 4;
        System.out.println("n /= 4  -> " + n);

        n %= 3;
        System.out.println("n %= 3  -> " + n);

        System.out.println("\n===== 6. TERNARY (CONDITIONAL) OPERATOR =====");
        int age = 18;

        String result = (age >= 18) ? "Eligible to vote" : "Not eligible";
        System.out.println("Result: " + result);

        System.out.println("\n===== 7. BITWISE OPERATORS =====");
        int m = 5;  // 0101
        int k = 3;  // 0011

        System.out.println("m & k  = " + (m & k));  // AND
        System.out.println("m | k  = " + (m | k));  // OR
        System.out.println("m ^ k  = " + (m ^ k));  // XOR
        System.out.println("~m     = " + (~m));     // NOT

        System.out.println("\n===== 8. SHIFT OPERATORS =====");
        int s = 8; // 1000

        System.out.println("s << 1 = " + (s << 1)); // Left shift
        System.out.println("s >> 1 = " + (s >> 1)); // Right shift
        System.out.println("s >>>1 = " + (s >>> 1)); // Unsigned right shift

        System.out.println("\n===== 9. INSTANCEOF OPERATOR =====");
        String str = "Java";

        System.out.println("str instanceof String : " + (str instanceof String));
        System.out.println("str instanceof Object : " + (str instanceof Object));

        System.out.println("\n===== 10. TYPE CASTING OPERATORS =====");
        int i = 100;
        double d = i; // Implicit casting
        System.out.println("Implicit casting int -> double: " + d);

        double d2 = 99.99;
        int i2 = (int) d2; // Explicit casting
        System.out.println("Explicit casting double -> int: " + i2);
    }
}
