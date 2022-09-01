package multithreading;

import java.util.Random;
import java.util.concurrent.*;

public class CallableFuture1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(new Callable<Integer>() {//Параметризован и метод call возвращает инт
            @Override
            public Integer call() throws Exception {
                System.out.println("Starting");
                Thread.sleep(500);
                System.out.println("Finished");
                Random random = new Random();
                int randomValue = random.nextInt(10);
                if(randomValue < 5){
                    throw new Exception("Something bad happened");
                }
                return randomValue;
            }
        });
        executorService.shutdown();
        try {
            int result = future.get();//get дожидается окончания потока
            System.out.println(result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            Throwable ex = e.getCause();
            System.out.println(ex.getMessage());//Так же с помощью этих классов можем в потоке выбрасывать исключения
        }
    }
}
