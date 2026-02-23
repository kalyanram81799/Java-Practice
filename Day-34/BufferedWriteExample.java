import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteExample {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("example2.txt"));
            bw.write("BufferedWriter writes text efficiently.");
            bw.newLine(); // insert newline
            bw.write("Second line using BufferedWriter.");
            bw.close();
            System.out.println("File written using BufferedWriter!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}