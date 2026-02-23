import java.io.File;

public class FileRenameExample {
    public static void main(String[] args) {
        File oldFile = new File("example3.txt");
        File newFile = new File("renamed_example.txt");
        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully!");
        } else {
            System.out.println("Rename failed!");
        }
    }
}