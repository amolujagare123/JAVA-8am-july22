package CollectionsDemos.MapDemos;

import java.util.HashMap;

public class HashMapDemo4 {

    public static void main(String[] args) {

        HashMap hs = new HashMap();
        System.out.println(hs.isEmpty());

        hs.put(101,"amol");
        hs.put(102,"rahul");
        hs.put(301,"vaishali");
        hs.put(441,"vaishali2");
        hs.put(551,"prakash");
        hs.put(321,"ashwini");
        System.out.println("size="+hs.size());
        System.out.println(hs.isEmpty());

        System.out.println("hs="+hs);

        System.out.println(hs.get(551));

        hs.remove(551);

        System.out.println("hs="+hs);

        System.out.println(hs.containsKey(441));
        System.out.println(hs.containsValue("amol"));


        hs.clear();
        System.out.println("hs="+hs);
    }
}
