import java.io.*;

class Account implements Serializable {
    String username;
    transient String password;

    Account(String u, String p) {
        username = u;
        password = p;
    }

    private void writeObject(ObjectOutputStream oos) throws Exception {
        oos.defaultWriteObject();
        oos.writeObject(password);  // manually save password
    }

    private void readObject(ObjectInputStream ois) throws Exception {
        ois.defaultReadObject();
        password = (String) ois.readObject();
    }
}

public class Custom{
    public static void main(String[] args) throws Exception {

        Account a = new Account("admin", "9999");

        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("demo6.txt"));
        oos.writeObject(a);
        oos.close();

        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("demo6.txt"));
        Account a2 = (Account) ois.readObject();
        ois.close();

        System.out.println(a2.username);
        System.out.println(a2.password);
    }
}