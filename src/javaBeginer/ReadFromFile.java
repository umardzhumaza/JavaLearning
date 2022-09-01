package javaBeginer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator; //Default system separator
        String url = separator + "Users" + separator + "24425" + separator + "Desktop" + separator + "test.txt"; //File path
        String otherUrl = "\\Users\\24425\\Desktop\\test.txt";
        File file = new File(otherUrl);

        Scanner scaner = new Scanner(file); //Read from file
        String line = scaner.nextLine(); //Read from file all lines and insert into String line.
        System.out.println(line);//Print on console

        //Parse string to int:
        String[] numbersString = line.split(" ");//Split of " ".
        int[] numbers = new int[3]; //Create new integer array at 3 elements.
        int counter = 0; //Add counter for indexing in cycle
        for (String number:numbersString
             ) {
            numbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));

        scaner.close();
    }
}
