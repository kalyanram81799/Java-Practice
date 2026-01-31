abstract class Sample {
    static void msg() {
        System.out.println("Static method");
    }
}

public class AbstractStatic {
    public static void main(String[] args) {
        Sample.msg();
    }
}
