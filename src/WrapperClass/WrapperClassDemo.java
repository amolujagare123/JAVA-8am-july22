package WrapperClass;

public class WrapperClassDemo {

    public static void main(String[] args) {

        int a = 10 ; // primitive

        Integer i = new Integer(10); // non primitive
        Integer i1 = new Integer(a); // wrapping or boxing

        System.out.println("i="+i);
        System.out.println("i1="+i1);

        Integer i2 = 10; // auto wrapping or auto boxing
        Integer i3 = a;

        System.out.println("i2="+i2);
        System.out.println("i3="+i3);

        //----------------------------------


        int x = i2.intValue(); // unboxing / unwrapping

        System.out.println("x="+x);

        int y = i2; // auto unboxing / auto unwrapping

        System.out.println("y="+y);




    }
}
