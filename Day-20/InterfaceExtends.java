interface A {
    void m1();
}

interface B extends A {
    void m2();
}

class Test implements B {
    public void m1() {
        System.out.println("m1");
    }

    public void m2() {
        System.out.println("m2");
    }
}

public class InterfaceExtends {
    public static void main(String[] args) {
        Test t = new Test();
        t.m1();
        t.m2();
    }
}
