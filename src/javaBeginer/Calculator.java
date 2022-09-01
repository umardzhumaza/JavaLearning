package javaBeginer;

import java.io.IOException;
import java.util.Scanner;


public class Calculator {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

          while(true){
              System.out.println("Введите первое число и нажмите Enter: ");
              double firstValue = scan.nextDouble();
              System.out.println("Введите математическое действие: ('+''-''*''/') ");
              String action = scan.next();
              System.out.println("Введите второе число: ");
              double secondValue = scan.nextDouble();
              try{
                  switch (action){
                      case "+" :
                          System.out.println("Результат сложения: " + (firstValue + secondValue));
                          break;
                      case "-" :
                          System.out.println("Результат вычитания: " + (firstValue - secondValue));
                          break;
                      case "*" :
                          System.out.println("Результат умножения: " + (firstValue * secondValue));
                          break;
                      case "/":
                          if (secondValue == 0){
                              System.out.println("Делить на ноль нельзя! ");
                          }else System.out.println("Результат деления: " + (firstValue / secondValue));
                          break;
                      default:
                          System.out.println("Неверный формат данных!");

                  }

              }catch (Exception ex){

              }
          }
        }
    }
