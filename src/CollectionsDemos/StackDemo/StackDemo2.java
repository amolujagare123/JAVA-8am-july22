package CollectionsDemos.StackDemo;

import java.util.Stack;

public class StackDemo2 {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        s.push("amol"); // 0 | 8
        s.push("rahul"); // 1 | 7
        s.push("rohit"); // 2 | 6
        s.push("shiva"); // 3 | 5
        s.push("bharat"); // 4 | 4
        s.push("sreedevi"); // 5 | 3
        s.push("madhavi"); // 6 | 2
        s.push("modin"); // 7 | 1


        System.out.println(s);

        System.out.println(s.search("sreedevi"));


    }
}
