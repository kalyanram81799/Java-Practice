import java.io.*;

class Sample implements Serializable {
    final int x = 10;
}

public class FinalDemo {
    public static void main(String[] args) throws Exception {

        Sample s = new Sample();

        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("demo10.txt"));
        oos.writeObject(s);
        oos.close();

        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("demo10.txt"));
        Sample s2 = (Sample) ois.readObject();
        ois.close();

        System.out.println(s2.x);
    }
}