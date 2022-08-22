package CollectionsDemos.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSetMethodDemo {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("rahul");
        al.add("rohit");
        al.add("shiva");
        al.add("bharat");
        al.add("sreedevi");
        al.add("madhavi");
        al.add("modin");

        System.out.println(al);

        al.set(7,"xyz");

        System.out.println(al);


    }
}
