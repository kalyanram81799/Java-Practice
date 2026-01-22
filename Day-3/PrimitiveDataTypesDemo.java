public class PrimitiveDataTypesDemo
 {
    public static void main(String[] args) 
    {

        // Integer types
        byte b = 10;          // 1 byte
        short s = 200;        // 2 bytes
        int i = 100000;       // 4 bytes
        long l = 1000000000L; // 8 bytes (L is mandatory)

        // Floating point types
        float f = 10.5f;      // 4 bytes (f mandatory)
        double d = 99.99;     // 8 bytes (default)

        // Character type
        char c = 'A';         // 2 bytes (Unicode)

        // Boolean type
        boolean isJavaFun = true; // true or false

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + isJavaFun);
    }
}
