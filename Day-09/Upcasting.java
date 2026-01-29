class Parent {
    void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    void childMethod() {
        System.out.println("Child method");
    }
}

public class Upcasting {
    public static void main(String[] args) {
        Parent p = new Child(); 
        p.show();
    }
}
