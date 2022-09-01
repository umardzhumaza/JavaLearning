package work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class PathAndFiles {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\24425\\Desktop\\JavaLearn\\Java");

        System.out.println("filePath.getFileName() " + filePath.getFileName());
        System.out.println("directoryPath.getFileName() " + directoryPath.getFileName());
        System.out.println("-------------------------------------------------------------");

        System.out.println("filePath.getParent() " + filePath.getParent());
        System.out.println("directoryPath.getParent() " + directoryPath.getParent());
        System.out.println("-------------------------------------------------------------");

        System.out.println("filePath.getRoot() " + filePath.getRoot());
        System.out.println("directoryPath.getRoot() " + directoryPath.getRoot());
        System.out.println("-------------------------------------------------------------");

        System.out.println("filePath.toAbsolutePath().getParent() " + filePath.toAbsolutePath().getParent());
        System.out.println("directoryPath.toAbsolutePath() " + directoryPath.toAbsolutePath());
        System.out.println("-------------------------------------------------------------");

        System.out.println("directoryPath.resolve(filePath) " + directoryPath.resolve(filePath));
        System.out.println("-------------------------------------------------------------");

        Path anotherPath = Paths.get("C:\\Users\\24425\\Desktop\\JavaLearn\\Java\\Python\\C##\\JavaScript\\test20.txt");
        System.out.println("directoryPath.relativize(anotherPath) " + directoryPath.relativize(anotherPath));
        System.out.println("-------------------------------------------------------------");

        if(!Files.exists(filePath)){
            Files.createFile(filePath);
        }
        if(!Files.exists(directoryPath)){
            Files.createDirectory(directoryPath);
        }
        System.out.println("Files.isSameFile(filePath,directoryPath) " + Files.isSameFile(filePath,directoryPath));
        System.out.println("-------------------------------------------------------------");

        System.out.println("Files.size(filePath) " + Files.size(filePath));
        System.out.println("-------------------------------------------------------------");

        System.out.println("Files.getAttribute(filePath,\"creationTime\") " + Files.getAttribute(filePath,"creationTime"));
        System.out.println("-------------------------------------------------------------");

        Map<String,Object> attribute = Files.readAttributes(filePath,"*");
        for(Map.Entry<String,Object> entry: attribute.entrySet()){
            System.out.println("Files.readAttributes(filePath,\"*\") " + entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("-------------------------------------------------------------");
    }
}
