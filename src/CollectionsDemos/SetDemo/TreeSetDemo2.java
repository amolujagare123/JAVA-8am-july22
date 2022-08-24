package CollectionsDemos.SetDemo;

import java.util.TreeSet;

public class TreeSetDemo2 {

    public static void main(String[] args) {

        TreeSet ts = new TreeSet();

        ts.add("amol");
        ts.add("rahul");
        ts.add("rohit");
        ts.add(12);
        ts.add(1.8);
        ts.add(true);
        ts.add("madhavi");
        ts.add("modin");
        ts.add("modin");

        System.out.println(ts);
    }
}
