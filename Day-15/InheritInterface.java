interface A {
    void m1();
}

interface B {
    void m2();
}

class C implements A, B {
    public void m1() {
        System.out.println("Method m1");
    }

    public void m2() {
        System.out.println("Method m2");
    }
}

public class InheritInterface {
    public static void main(String[] args) {
        C obj = new C();
        obj.m1();
        obj.m2();
    }
}
