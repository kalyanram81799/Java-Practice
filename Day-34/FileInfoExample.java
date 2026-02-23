import java.io.File;

public class FileInfoExample {
    public static void main(String[] args) {
        File file = new File("example1.txt");
        if (file.exists()) {
            System.out.println("File exists!");
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Size in bytes: " + file.length());
        } else {
            System.out.println("File does not exist!");
        }
    }
}