class Parent {
    Object get() {
        return new Object();
    }
}

class Child extends Parent {
    String get() {
        return "Hello";
    }
}

public class Covariant {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.get());
    }
}
