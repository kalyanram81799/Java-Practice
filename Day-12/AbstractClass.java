abstract class Demo {
    void show() {
        System.out.println("Hello");
    }
}

class Test extends Demo {
}

public class AbstractClass{
    public static void main(String[] args) {
        Demo d = new Test();
        d.show();
    }
}
