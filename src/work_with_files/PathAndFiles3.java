package work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFiles3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test10.txt");
//        Files.createFile(filePath);
//        String dialog = "-Hello\n-Hi\n-How are you?\n-I'm fine! How about you?\n-Good!";
//        Files.write(filePath,dialog.getBytes());

        List<String> list = Files.readAllLines(filePath);
        for(String s: list){
            System.out.println(s);
        }
    }
}
