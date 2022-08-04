package InheritanceDemos.Polymorphism;

public class CastingDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        double c = (double) a/b;

        // if you want to store one type of value into another
        // type , then use that type in front tof the value to
        // be stored in round brackets, this is known as
        // type casting

        System.out.println("c="+c);
    }
}
