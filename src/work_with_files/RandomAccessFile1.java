package work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile1 {
    public static void main(String[] args) {
         try(RandomAccessFile file = new RandomAccessFile("test.txt","rw")){
             int a = file.read();
             System.out.println((char)a);

             String s1 = file.readLine();
             System.out.println(s1);

             file.seek(101);
             String s2 = file.readLine();
             System.out.println(s2);

             long position = file.getFilePointer();
             System.out.println(position);

//             file.seek(0);
//             file.writeBytes("Привет");

             file.seek(file.length()-1);
             file.writeBytes("\n\t\t\t\t\t\tWilliam Butler Yeats");

         } catch (FileNotFoundException e) {
             throw new RuntimeException(e);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
    }
}
