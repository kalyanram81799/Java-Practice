import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        try {

            FileWriter writer = new FileWriter("example1.txt");

            // Step 2: Write text to the file
            writer.write("Hello World!\nThis is my first file.");

            // Step 3: Close the writer to save data
            writer.close();

            System.out.println("File written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}