package work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\n"+
                       "Непонятного нет для меня под луной.\n"+
                       "Мне известно, что мне ничего неизвестно!\n"+
                       "Во последняя правда, открытая мной.\n";
        String s = "privet";
        FileWriter writer = null;
        try {
            writer = new FileWriter("\\C:\\Users\\24425\\Desktop\\test.txt",true);
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
            writer.write(s);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            writer.close();
        }

    }
}
