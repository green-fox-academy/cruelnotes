import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {

    // Write a function that copies a file to an other
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful

    public static void main(String[] args) {
        System.out.println(copyFiles("src/my-file.txt", "src/my-fileCopy.txt"));
    }

    public static boolean copyFiles (String inputSrc, String outputSrc) {
        Path filepath = Paths.get(inputSrc);
        Path destFileContent = Paths.get(outputSrc);
        boolean success;
        try {
            List<String> sourceFileContent = Files.readAllLines(filepath);
            Files.write(destFileContent, sourceFileContent);
            success = true;
        } catch (IOException e){
            success = false;
        }
        return success;
    }
}