package collections.arrayList.queue;

import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> que = new PriorityQueue<>();
        que.add(1);
        que.add(4);
        que.add(8);
        que.add(2);
        que.add(10);
        //Приоритетность 1 4 8...
        System.out.println(que.peek());
        System.out.println(que.remove());
        PriorityQueue<String> que2;
    }
}
