package multithreading;

public class Synchronized1 {
    private int counter;
    public static void main(String[] args) throws InterruptedException {
        Synchronized1 sc = new Synchronized1();
        sc.doWork();

    }
    //Состояние гонки RaceCondition
    //1: 100 -> 101 -> 102 -> 103 -> 104 -> 105  вырвался вперед первый поток
    //2: 100 -> 101  Второй начал заного
    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();//Подождать пока закончит работу поток thread1
        thread2.join();//Подождать пока закончит работу поток thread2

        System.out.println(counter);
    }
    public synchronized void increment(){
        counter++;
    }
}
