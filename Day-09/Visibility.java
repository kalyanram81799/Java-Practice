class Parent {
    protected void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    public void show() {
        System.out.println("Child show");
    }
}

public class Visibility {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}
