package CollectionsDemos.SetDemo;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("amol");
        ts.add("rahul");
        ts.add("rohit");
        ts.add("shiva");
        ts.add("bharat");
        ts.add("sreedevi");
        ts.add("madhavi");
        ts.add("modin");
        ts.add("modin");

        System.out.println(ts);
    }
}
