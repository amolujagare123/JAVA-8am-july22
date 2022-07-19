package controlStructure;

public class IncrementDemo {

    public static void main(String[] args) {

        int a = 10;
        System.out.println(a); // 10
        System.out.println(a++); // 10
        System.out.println(a); // 11
        System.out.println(++a); // 12
        System.out.println(a); // 12

        /* a++ , a - -  ( a = a+1 / a = a-1) :
        first statements are executed then increment / decrement happens

        ++a , - - a  ( a = a+1 / a = a-1) :
        first increment / decrement happens then statements are executed
*/

    }
}
