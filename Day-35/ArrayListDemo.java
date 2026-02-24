import java.io.*;
import java.util.*;

public class ArrayListDemo {
        public static void main(String[] args) throws Exception {

                ArrayList<String> list = new ArrayList<>();
                list.add("Java");
                list.add("Python");

                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("demo9.txt"))) {
                    oos.writeObject(list);
                }

                try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("demo9.txt"))) {
                    ArrayList<String> newList = (ArrayList<String>) ois.readObject();
                    System.out.println(newList);
                }
        }
}