import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {

// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

    public static void main(String[] args) {

        String src = "src/duplicated-chars.txt";
        lineCountCall(src);
    }

    public static int lineCountCall(String src) {
        int total = 0;

        Path fileSource = Paths.get(src);
        List<String> lines = null;
        try {
            lines = Files.readAllLines(fileSource);

        } catch (IOException e) {
            //  System.out.println("0");
        }
        for (String line: lines) {
            total += 1;
        }
        System.out.println(total);
        return total;
    }


}