package CollectionsDemos.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveDemo {

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

        al.remove("rohit");
        al.remove(4);

        System.out.println("al="+al);


    }
}
