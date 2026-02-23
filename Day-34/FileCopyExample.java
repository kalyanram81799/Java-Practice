import java.io.*;

public class FileCopyExample {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("example1.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("copy.txt"));

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            br.close();
            bw.close();
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}