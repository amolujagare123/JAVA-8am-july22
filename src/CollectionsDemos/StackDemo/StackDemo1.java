package CollectionsDemos.StackDemo;

import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        System.out.println(s.empty()); // true

        s.push("amol");
        s.push("rahul");
        s.push("rohit");
        s.push("shiva");
        s.push("bharat");
        s.push("sreedevi");
        s.push("madhavi");
        s.push("modin");

        System.out.println(s.empty()); // false

        System.out.println(s);

        System.out.println(s.pop());

        System.out.println(s);

        System.out.println(s.pop());

        System.out.println(s);

        System.out.println(s.peek());

        System.out.println(s);
    }
}
