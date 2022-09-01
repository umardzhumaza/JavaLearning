package javaBeginer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("\\Users\\24425\\Desktop\\test.txt");
        PrintWriter printWriter = new PrintWriter(file);

        printWriter.println("Привет мир");
        printWriter.println("Hello world");
        printWriter.println("Shi jie ni hao");
        printWriter.close();
    }
}
