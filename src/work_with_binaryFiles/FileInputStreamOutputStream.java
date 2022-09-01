package work_with_binaryFiles;

import java.io.*;

public class FileInputStreamOutputStream {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("\\D:\\Downloads\\java_logo_640.jpg");
            FileOutputStream fileOutputStream = new FileOutputStream("1test.jpg")){
            int i;
            while ((i=fileInputStream.read())!=-1){
                fileOutputStream.write(i);
            }
//            String line;
//            while ((line=reader.readLine())!=null){
//                writer.write(line);
//                writer.write("\n");
//            }
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
