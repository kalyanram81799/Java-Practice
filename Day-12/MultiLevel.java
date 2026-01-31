abstract class A {
    abstract void show();
}

abstract class B extends A {
}

class C extends B {
    void show() {
        System.out.println("Implemented in C");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        A obj = new C();
        obj.show();
    }
}
