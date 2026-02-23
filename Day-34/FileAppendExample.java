import java.io.FileWriter;
import java.io.IOException;

public class FileAppendExample{
    public static void main(String[] args) {
        try {
            // true -> append mode
            FileWriter writer = new FileWriter("example1.txt", true);
            writer.write("\nAppending a new line to the file.");
            writer.close();
            System.out.println("Data appended successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}