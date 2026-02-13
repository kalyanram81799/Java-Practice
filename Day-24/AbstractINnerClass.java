abstract class A {
    abstract void show();
}

public class AbstractInnerClass {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("to abstract class");
            }
        };
    }
}