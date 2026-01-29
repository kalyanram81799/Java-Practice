class Parent {
    static void show() {
        System.out.println("Parent static");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child static");
    }
}

public class MethodHiding {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show(); // Parent static
    }
}
