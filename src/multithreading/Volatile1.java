package multithreading;

import java.util.Scanner;

public class Volatile1 {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        thread1.start();

        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        thread1.shutDown();

    }
}

class MyThread1 extends Thread{
    private volatile boolean running = true;//Гарантирует кагерентность кешей, эту переменную CPU(Ядро) не будет кешировать
    public void run(){
        while (running){
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void shutDown(){
        this.running = false;
    }
}
