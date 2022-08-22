package CollectionsDemos.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIfDemo2 {

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

       // 1. remove all the elements those starts with m

      //  al.removeIf(str -> str.length()<=5 );


     //   al.removeIf(str -> str.startsWith("m"));

        // 2. remove all the elements whose second element is 'a'
        al.removeIf(str-> str.charAt(1)=='a');


        System.out.println(al);


    }
}
