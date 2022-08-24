package CollectionsDemos.QueueDemos;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueDemo2 {

    public static void main(String[] args) {

        ArrayDeque<Integer> pq = new ArrayDeque<>();

        pq.offer(987);
        pq.offer(876);
        pq.offer(765);
        pq.offer(654);
        pq.offer(543);
        pq.offer(321);
        pq.offer(210);

        System.out.println(pq);

        pq.offerFirst(0);
        pq.offerLast(100);
        System.out.println(pq);

        pq.pollFirst();
        pq.pollLast();
        System.out.println(pq);





    }
}
