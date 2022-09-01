package exceptions;

import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args)throws MyTestException{
        Scanner scanner = new Scanner(System.in);
        while(true){
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0){
                System.out.println(x);
            }else{
                try {
                    throw new MyTestException();
                } catch (MyTestException e) {
                    System.out.println("Вы ввели ноль");
                }
                test();
            }
        }
    }
    public static void test() throws MyTestException {
        Scanner scanner = new Scanner(System.in);
        while(true){
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0){
                System.out.println(x);
            }else{
               throw new MyTestException("Ноль вводить нельзя");
            }
        }

    }
}
