public class DataTypeSize {
    public static void main(String[] args) {

        // byte
        System.out.println("byte size: " + Byte.BYTES + " bytes");
        System.out.println("byte range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println();

        // short
        System.out.println("short size: " + Short.BYTES + " bytes");
        System.out.println("short range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println();

        // int
        System.out.println("int size: " + Integer.BYTES + " bytes");
        System.out.println("int range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println();

        // long
        System.out.println("long size: " + Long.BYTES + " bytes");
        System.out.println("long range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println();

        // float
        System.out.println("float size: " + Float.BYTES + " bytes");
        System.out.println("float range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println();

        // double
        System.out.println("double size: " + Double.BYTES + " bytes");
        System.out.println("double range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println();

        // char
        System.out.println("char size: " + Character.BYTES + " bytes");
        System.out.println("char range: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        System.out.println();

        // boolean (special case)
        System.out.println("boolean size: Not precisely defined");
        System.out.println("boolean values: true or false");
    }
}
