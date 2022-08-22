package CollectionsDemos.LinkedListDemo;

import java.util.LinkedList;

public class LinkedListDemo1 {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("amol");
        ll.add("rahul");
        ll.add("rohit");
        ll.add("shiva");
        ll.add("bharat");
        ll.add("sreedevi");
        ll.add("madhavi");
        ll.add("modin");

        System.out.println(ll);

        ll.addFirst("first");
        ll.addLast("last");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);


    }
}
