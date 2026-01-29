//polymorphism in method argument
class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing rectangle");
    }
}
public class PolyArgumen{
    static void paint(Shape s)
    {
        s.draw();
    }
   
           public static void main(String[] args) {
        paint(new Circle());
        paint(new Rectangle());
    }
    }
