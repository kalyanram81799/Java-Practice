class Parent {
    final void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    // cannot override
}

public class FinalPoly {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}
