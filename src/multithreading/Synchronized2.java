package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Synchronized2 {
    public static void main(String[] args) throws InterruptedException {
        new Worker().main();
    }
}
class Worker{
    Object lock1 = new Object();//Создаем два монитора с помощью объекта обжект.
    Object lock2 = new Object();
    Random rnd = new Random();
    private List<Integer> list = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public void addToList1() {
        synchronized (lock1) {//Теперь одновременно два потока могут брать два метода параллельно
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list.add(rnd.nextInt(100));
        }
    }
    public void addToList2() {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list2.add(rnd.nextInt(100));
        }
    }
    public void work() {
        for (int i = 0; i < 1000; i++) {
            addToList1();
            addToList2();
        }
    }
    public void main() throws InterruptedException {
        long before = System.currentTimeMillis();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        long after = System.currentTimeMillis();
        System.out.println("Program took " + (after - before) + " ms to run");

        System.out.println("List1 : " + list.size());
        System.out.println("List2 : " + list2.size());
    }
}
