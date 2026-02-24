import java.io.*;

class User implements Serializable {
    String username;
    transient String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

public class Transient {
    public static void main(String[] args) {
        try {
            User u = new User("kalyan", "ram");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("demo2.txt"));
             oos.writeObject(u);
             oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
try {
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("demo2.txt"));
    User u2 = (User) ois.readObject();
    ois.close();
    System.out.println("Username: " + u2.username);
    System.out.println("Password: " + u2.password);
} catch (IOException e) {
    e.printStackTrace();
} catch (ClassNotFoundException e) {
    e.printStackTrace();
}
    }
}