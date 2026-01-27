class Parent { 
    void display() {
        System.out.println("Child display");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child display");
    }
}

public class Downcasting {
    public static void main(String[] args) {
        Parent p = new Child();   // upcasting
        p.display();
        Child c = (Child) p;      // downcasting
        c.display();
    }
}
