package CollectionsDemos.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListClearIsEmpty {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        System.out.println(al.isEmpty()); // true

        al.add(12);
        al.add(32);
        al.add(16);
        al.add(17);
        al.add(72);
        al.add(18);
        al.add(82);
        al.add(55);
        al.add(44);

        System.out.println(al.isEmpty()); // false


        System.out.println("al="+al);

        al.clear();
        System.out.println("al="+al);


    }
}
