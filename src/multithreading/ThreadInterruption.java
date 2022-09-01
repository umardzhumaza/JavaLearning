package multithreading;

import java.sql.SQLOutput;
import java.util.Random;

public class ThreadInterruption {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i = 0; i < 1_000_000_000; i++) {
                    if(Thread.currentThread().isInterrupted()){
                        System.out.println("Thread was interrupted");
                        break;
                    }
                    Math.sin(random.nextDouble());
                }
            }
        });
        System.out.println("Starting thread");

        thread1.start();

        Thread.sleep(1000);
        thread1.interrupt();

        thread1.join();



        System.out.println("Thread is finished");

    }
}
