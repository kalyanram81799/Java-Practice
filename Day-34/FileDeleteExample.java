import java.io.File;

public class FileDeleteExample {
    public static void main(String[] args) {
        File file = new File("copy1.txt");
        if (file.delete()) {
            System.out.println("File deleted successfully!");
        } else {
            System.out.println("Failed to delete file.");
        }
    }
}