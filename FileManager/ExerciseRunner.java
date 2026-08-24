import java.io.IOException;

public class ExerciseRunner {
    public static void main(String[] args) throws IOException {
        FileManager.createFile("FileManager/file.txt", "Lorem ipsum");
        System.out.println(FileManager.getContentFile("FileManager/file.txt"));
        FileManager.deleteFile("FileManager/dele");
    }
}