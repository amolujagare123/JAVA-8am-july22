package CollectionsDemos.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIfDemo {

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

       // 1. remove all the elements whose length is less than or equal 5
        al.removeIf(str -> str.length()<=5 );

        System.out.println(al);


    }
}
