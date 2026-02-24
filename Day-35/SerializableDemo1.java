import java.io.*;

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializableDemo1 {
    public static void main(String[] args) throws Exception {

        Student s = new Student(101, "Kalyan");

        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("demo1.txt"));
        oos.writeObject(s);
        oos.close();

        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("demo1.txt"));
        Student s2 = (Student) ois.readObject();
        ois.close();

        System.out.println(s2.id);
        System.out.println(s2.name);
    }
}