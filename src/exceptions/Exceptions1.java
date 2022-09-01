package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) throws FileNotFoundException {  //add exceptions
        File file = new File("adasd");

        Scanner scaner = new Scanner(file);
    }
}
