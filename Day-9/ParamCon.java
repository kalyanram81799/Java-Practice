class Parent {
    Parent(int x) {
        System.out.println("Parent parameterized constructor: " + x);
    }
}

class Child extends Parent {
    Child() {
        super(100);
        System.out.println("Child constructor");
    }
}

public class ParamCon {
    public static void main(String[] args) {
        new Child();
    }
}
