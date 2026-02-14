interface A {
    void show();
}

public class LambdaAnanymous {

    void display() {

        A obj = new A() {
            public void show() {
                System.out.println(this.getClass());
            }
        };

        obj.show();

        A obj2 = () -> {
            System.out.println(this.getClass());
        };

        obj2.show();
    }

    public static void main(String[] args) {
        new LambdaAnanymous().display();
    }
}
