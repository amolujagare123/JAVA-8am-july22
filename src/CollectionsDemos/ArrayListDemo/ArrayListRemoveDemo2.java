package CollectionsDemos.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveDemo2 {

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

        //al.remove(7);

        Integer i = new Integer(55);


      //  al.remove(al.get(7));
      //  al.remove(new Integer(55));


        Integer ii = 55;
        al.remove(ii);


        System.out.println("al="+al);


    }
}
