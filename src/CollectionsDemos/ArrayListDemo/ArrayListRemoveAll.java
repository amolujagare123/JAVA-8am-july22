package CollectionsDemos.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveAll {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(12);
        al.add(32);
        al.add(16);
        al.add(17);
        al.add(72);
        al.add(18);
        al.add(82);
        al.add(55);
        al.add(44);

        System.out.println("al="+al);


        ArrayList<Integer> al2 = new ArrayList<>();

        al2.add(12);

        al2.add(16);
        al2.add(17);
        al2.add(99);
        al2.add(88);
        al2.add(32);
        al2.add(16);
        al2.add(77);
        al2.add(33);

        System.out.println("al2="+al2);

        al2.removeAll(al);

        System.out.println("al2="+al2);




    }
}
