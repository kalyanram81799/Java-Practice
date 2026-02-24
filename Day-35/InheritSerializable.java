import java.io.*;

class Parent {
    int a = 10;
}

class Child extends Parent implements Serializable {
    int b = 20;
}

public class InheritSerializable {
    public static void main(String[] args) throws Exception {

        Child c = new Child();

        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("demo5.txt"));
        oos.writeObject(c);
        oos.close();

        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("demo5.txt"));
        Child c2 = (Child) ois.readObject();
        ois.close();

        System.out.println("a: " + c2.a);
        System.out.println("b: " + c2.b);
    }
}