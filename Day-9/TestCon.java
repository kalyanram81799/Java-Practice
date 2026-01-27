class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child constructor");
    }
}

public class TestCon {
    public static void main(String[] args) {
        new Child();
    }
}
