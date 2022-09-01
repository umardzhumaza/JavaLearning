package work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFiles2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\24425\\Desktop\\JavaLearn\\Java");

       // Files.copy(filePath,directoryPath.resolve("test16.txt"));
        Files.copy(filePath,directoryPath.resolve("test16.txt"), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Done!");

        Files.move(Paths.get("test15.txt"),Paths.get("test16.txt"));

//        Files.delete(directoryPath);


    }
}
