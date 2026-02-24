import java.io.*;

class Person implements Serializable {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class Multiple {
    public static void main(String[] args) throws Exception {

        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("demo8.txt"));

        oos.writeObject(new Person("Ram"));
        oos.writeObject(new Person("Shyam"));
        oos.close();

        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("demo8.txt"));

        Person p1 = (Person) ois.readObject();
        Person p2 = (Person) ois.readObject();
        ois.close();

        System.out.println(p1.name);
        System.out.println(p2.name);
    }
}