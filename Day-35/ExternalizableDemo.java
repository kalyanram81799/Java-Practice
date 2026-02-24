import java.io.*;

class Student implements Externalizable {
    int id;
    String name;

    public Student() { }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
        out.writeObject(name);
    }

    public void readExternal(ObjectInput in)
            throws IOException, ClassNotFoundException {
        id = in.readInt();
        name = (String) in.readObject();
    }
}

public class ExternalizableDemo {
    public static void main(String[] args) throws Exception {

        Student s = new Student(1, "Kalyan");

        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("demo7.txt"));
        oos.writeObject(s);
        oos.close();

        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("demo7.txt"));
        Student s2 = (Student) ois.readObject();
        ois.close();

        System.out.println(s2.id);
        System.out.println(s2.name);
    }
}