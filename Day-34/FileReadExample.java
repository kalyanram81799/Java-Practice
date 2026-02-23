import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("example1.txt");
            int ch;

            // Read character by character until end of file (-1)
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}