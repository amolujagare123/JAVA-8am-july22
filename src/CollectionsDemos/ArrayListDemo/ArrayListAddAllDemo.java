package CollectionsDemos.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAddAllDemo {

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

        System.out.println("al="+al);

        ArrayList<String> al2 = new ArrayList<>();
        System.out.println("al2="+al2);

        al2.addAll(al);

        System.out.println("al2="+al2);

    }
}
