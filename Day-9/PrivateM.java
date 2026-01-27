class Parent {
    private int x = 10;

    int getX() {
        return x;
    }
}

class Child extends Parent {
    void show() {
        // System.out.println(x); ❌
        System.out.println(getX());
    }
}

public class PrivateM {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
        Parent p=new Parent();
        p.getX();
    }
}
