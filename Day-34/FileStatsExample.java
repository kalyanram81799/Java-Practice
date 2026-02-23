import java.io.*;

public class FileStatsExample {
    public static void main(String[] args) {
        int lines = 0, words = 0, chars = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("example1.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                lines++;
                chars += line.length();
                words += line.split("\\s+").length;
            }
            br.close();
            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + chars);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}