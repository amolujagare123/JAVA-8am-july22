package CollectionsDemos.ArrayListDemo;

import java.util.ArrayList;
import java.util.Date;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();

        al.add("amol");
        al.add("rahul");
        al.add("rohit");
        al.add("shiva");
        al.add(12);
        al.add(32);
        al.add(16);
        al.add(1.2);
        al.add(true);
        al.add('h');
        al.add('h');

        System.out.println(al);

        for (Object obj:al)
            System.out.println(obj);
    }
}
