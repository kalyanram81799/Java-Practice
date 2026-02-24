import java.io.*;

class Employee implements Serializable {
    private static final long serialVersionUID = 2L;
    int id;
    String name;
    Double salary;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Employee() {

    }
}

public class Suid {
    public static void main(String[] args) throws Exception {

        Employee e = new Employee(1, "Ram");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("demo3.txt"));
        oos.writeObject(e);
        oos.close();

        System.out.println("Serialized Successfully");
    }
}
