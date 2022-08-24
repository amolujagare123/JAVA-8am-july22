package CollectionsDemos.QueueDemos;

import java.util.PriorityQueue;

public class QueueDemo1 {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(987);
        pq.offer(876);
        pq.offer(765);
        pq.offer(654);
        pq.offer(543);
        pq.offer(321);
        pq.offer(210);

        System.out.println(pq);

        // 210 , 321 ,543, 645, 765 , 876 , 987

        System.out.println(pq.poll()); //210
        System.out.println(pq.poll()); //321
        System.out.println(pq.poll()); //543
        System.out.println(pq.poll()); //654
        System.out.println(pq.poll()); //765
        System.out.println(pq.poll()); //876
        System.out.println(pq.poll()); //987


        /* Note : some operating systems does not support
        priority queue . so the output seems random, but
        if you remove the elements you will observe that
        elements are stored in ascending order ,
        since they get removed in that order*/



    }
}
