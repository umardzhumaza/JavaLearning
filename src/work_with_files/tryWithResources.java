package work_with_files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class tryWithResources {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\n"+
                "Непонятного нет для меня под луной.\n"+
                "Мне известно, что мне ничего неизвестно!\n"+
                "Во последняя правда, открытая мной.\n";
        String s = "privet";

        try (FileWriter writer = new FileWriter("\\C:\\Users\\24425\\Desktop\\test.txt");
             FileReader reader = new FileReader("\\C:\\Users\\24425\\Desktop\\test.txt")){
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
            writer.write(s);
            System.out.println("Done!");
        }
        try(FileReader reader = new FileReader("\\C:\\Users\\24425\\Desktop\\test.txt")){
            int characters;
            while((characters= reader.read())!=-1){
                System.out.print((char)characters);
            }
            System.out.println();
            System.out.println("Done!");
        }
    }
}
