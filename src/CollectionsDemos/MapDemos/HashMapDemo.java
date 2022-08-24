package CollectionsDemos.MapDemos;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap hs = new HashMap();
        hs.put(101,"amol");
        hs.put(102,"rahul");
        hs.put(301,"vaishali");
        hs.put(301,"vaishali2");
        hs.put(27.8,'c');
        hs.put(true,1234);
        hs.put(null,1234);
        hs.put(null,90);

        System.out.println(hs);
    }
}
