package CollectionsDemos.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

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

        System.out.println("size="+al.size()); // 8
        System.out.println(al.get(2));
       /* String str = "roshani";
        al.add(str);*/
        System.out.println("======= printing Directly =====");
        System.out.println(al);

        System.out.println("======= printing using for loop =====");
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

        System.out.println("======= printing using for each loop =====");

        for(String name:al)
        {
            System.out.println(name);
        }


        System.out.println("======= printing using Iterator =====");

        Iterator itr = al.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());

    }
}
