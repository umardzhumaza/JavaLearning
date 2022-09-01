package multithreading;

public class Thread1 {
    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread();
//        myThread.start();//Первый поток
//
//        MyThread myThread1 = new MyThread();
//        myThread1.start();//Второй поток

        Thread thread = new Thread(new Runner());//Аналогично созданию нового класса с наследованием Thread
        thread.start();

        System.out.println("Hello from main");

    }
}
class Runner implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello from my thread!" + i);
        }
    }
}
class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello from my thread!" + i);
        }
    }
}
