

public class CopyFile {
// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

    public static void main(String[] args) {

        copy("source.txt", "dest.txt");

    }

    public static void copy(String sourcePath, String destinationPath) throws IOException {
        Files.copy(Paths.get(sourcePath), new FileOutputStream(destinationPath));
    }

}

