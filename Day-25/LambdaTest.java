// @FunctionalInterface
// interface Demo {
//     int sum(int a, int b);
// }

// public class LambdaTest {
//     public static void main(String[] args) {
//         Demo d = (a, b) -> a + b;

//         System.out.println(d.sum(4, 5));
//     }
// }
@FunctionalInterface
interface A {
    void show();
}

public class LambdaTest {
    public static void main(String[] args) {
        A a = () -> System.out.println("from lambda expression");
        a.show();
    }
}