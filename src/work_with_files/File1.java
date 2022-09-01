package work_with_files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class File1 {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        File folder = new File("\\C:\\Users\\24425\\Desktop\\JavaLearn");
        File folder2 = new File("\\C:\\Users\\24425\\Desktop\\Test");
        File file2 = new File("\\C:\\Users\\24425\\Desktop\\JavaLearn\\test.txt");
        System.out.println("file.getAbsolutePath() "+file.getAbsolutePath());
        System.out.println("folder.getAbsolutePath() "+folder.getAbsolutePath());
        System.out.println("------------------------------------------------------");

        System.out.println("file is Absolute " + file.isAbsolute());
        System.out.println("folder is Absolute " + folder .isAbsolute());
        System.out.println("------------------------------------------------------");

        System.out.println("file.isDirectory() "+file.isDirectory());
        System.out.println("folder.isDirectory() "+folder.isDirectory());
        System.out.println("------------------------------------------------------");

        System.out.println("file.exists() "+file.exists());
        System.out.println("folder.exists() "+folder.exists());
        System.out.println("file2.exists() "+file2.exists());
        System.out.println("folder2.exists() "+folder2.exists());
        System.out.println("------------------------------------------------------");

        System.out.println("file2.createNewFile() "+file2.createNewFile());
        System.out.println("folder2.mkdir() "+folder2.mkdir());
        System.out.println("------------------------------------------------------");

        System.out.println("file2.length() "+file2.length());
        System.out.println("folder2.length() "+folder2.length());
        System.out.println("------------------------------------------------------");

        System.out.println("file2.delete() "+file2.delete());
        System.out.println("folder2.delete() "+folder2.delete());
        System.out.println("------------------------------------------------------");

        File[] array = folder.listFiles();
        System.out.println("folder.listFiles() "+ Arrays.toString(array));
        System.out.println("------------------------------------------------------");

        System.out.println("file.isHidden() "+file.isHidden());
        System.out.println("folder.canRead() "+folder.canRead());
        System.out.println("file.canWrite() "+file.canWrite());
        System.out.println("folder.canExecute() "+folder.canExecute());


    }
}
