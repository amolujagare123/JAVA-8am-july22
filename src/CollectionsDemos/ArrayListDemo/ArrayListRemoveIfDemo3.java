package CollectionsDemos.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIfDemo3 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(11);
        al.add(76);
        al.add(12);
        al.add(91);
        al.add(55);
        al.add(86);
        al.add(32);
        al.add(87);

        System.out.println(al);

        // 1. remove the elements which are odd

        //al.removeIf(a -> a%2!=0);

        // 2. remove the elements which less than or equal to 55

        al.removeIf(a -> a<=55);

        System.out.println(al);


    }
}
