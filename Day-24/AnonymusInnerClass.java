interface A {
    public void show();
}

public class AnonymusInnerClass {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("from the anonymus inner class");
            }
        };
        obj.show();
    }
}