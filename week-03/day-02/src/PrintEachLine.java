import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.io.IOException;

public class PrintEachLine {

    // Write a program that opens a file called "my-file.txt", then prints
    // each of lines form the file.
    // If the program is unable to read the file (for example it does not exists),
    // then it should print an error message like: "Unable to read file: my-file.txt"


  public static void main(String[] args) {

      Path fileSource = Paths.get("src/my-file.txt");
      List<String> lines = null;
      try {
         lines = Files.readAllLines(fileSource);

      } catch (IOException e) {
          System.out.println("Unable to read file: my-file.txt");
      }
      for (String line: lines) {
          System.out.println(line);
      }
  }
}

