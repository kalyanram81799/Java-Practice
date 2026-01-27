class Parent {
    static void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child");
    }
}

public class MethodHiding {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
        Child.show();
    }
}
