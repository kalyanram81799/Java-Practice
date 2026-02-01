interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class InterfacePoly {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.draw();

        s = new Rectangle();
        s.draw();
    }
}
