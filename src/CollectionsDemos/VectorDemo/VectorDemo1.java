package CollectionsDemos.VectorDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo1 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        System.out.println("Capacity="+v.capacity()); // 10
        System.out.println("size="+v.size()); // 0

        v.add("amol");
        v.add("rahul");
        v.add("rohit");
        v.add("shiva");
        v.add("bharat");
        v.add("sreedevi");
        v.add("madhavi");
        v.add("modin");
        v.add("madhavi");
        v.add("modin");
        v.add("modin");
        v.add("amol");
        v.add("rahul");
        v.add("rohit");
        v.add("shiva");
        v.add("bharat");
        v.add("sreedevi");
        v.add("madhavi");
        v.add("modin");
        v.add("madhavi");
        v.add("madhavi");


        System.out.println("Capacity="+v.capacity());// 40
        System.out.println("size="+v.size());// 21

        System.out.println(v);

        System.out.println("===== Using Iterator");

        Iterator itr = v.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        System.out.println("===== Using Enumeration");

        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());
    }
}
