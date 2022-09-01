package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions4 {
    public static void main(String[] args) throws FileNotFoundException {
        //Checked Exception(Compile time exception) = Исключительные случаи в работе программы
        File file = new File("adasd");

        Scanner scaner = new Scanner(file);

        //Unchecked Exception(Run Time Exception) = Ошибка в работе программы
        int a = 1 /0; // ArithmeticException /0 by Zero
        String name = null;
        name.length(); //NullPointerException
        int[] array = new int[2];
        System.out.println(array[2]); //ArrayIndexOutOfBoundsException
    }
}
