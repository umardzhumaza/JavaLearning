package work_with_files;

import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
    public static void main(String[] args) throws IOException {
      FileReader file = null;
        try {
            file = new FileReader("\\C:\\Users\\24425\\Desktop\\test.txt");
            int character;
            while((character= file.read())!=-1){
                System.out.print((char)character);
            }
            System.out.println();
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            file.close();
        }

    }
}
