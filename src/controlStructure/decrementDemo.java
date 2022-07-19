package controlStructure;

public class decrementDemo {

    public static void main(String[] args) {

        int a = 10;
        System.out.println(a); // 10
        System.out.println(a--); // 10
        System.out.println(a); // 9
        System.out.println(--a); // 8
        System.out.println(a); // 8

        /* a++ , a - -  ( a = a+1 / a = a-1) :
        first statements are executed then increment / decrement happens

        ++a , - - a  ( a = a+1 / a = a-1) :
        first increment / decrement happens then statements are executed
*/

    }
}
