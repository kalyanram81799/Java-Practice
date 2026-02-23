import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class PrintWriterExample {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("example3.txt"));
            pw.println("This is PrintWriter."); // automatically adds newline
            pw.printf("Name: %s, Age: %d%n", "Alice", 25); //
            // formatted
            pw.println("hi" + 90 + 'k');
            pw.close();
            System.out.println("File written using PrintWriter!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}