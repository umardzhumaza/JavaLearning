package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) {
        File file = new File("adasd");

        try {
            Scanner scanner = new Scanner(file);
            System.out.println("After scanner");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        System.out.println("After try catch block....");

        try {
            readFile();//We need add throws FileNotFoundExceprion in main too;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void readFile() throws FileNotFoundException {
        File file2 = new File("adasd");
        Scanner scanner = new Scanner(file2);
    }
}
