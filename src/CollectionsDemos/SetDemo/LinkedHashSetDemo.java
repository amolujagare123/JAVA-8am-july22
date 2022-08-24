package CollectionsDemos.SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("amol");
        lhs.add("rahul");
        lhs.add("rohit");
        lhs.add("shiva");
        lhs.add("bharat");
        lhs.add("sreedevi");
        lhs.add("madhavi");
        lhs.add("modin");
        lhs.add("modin");

        System.out.println(lhs);
    }
}
