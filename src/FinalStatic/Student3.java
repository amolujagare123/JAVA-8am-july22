package FinalStatic;


public class Student3 {

    int rno;
    String name;
    public static String college ="ITC";
    String city;

    public void display() // non static method can call static as well as non static members
    {
        System.out.println("rno="+rno); // non static - allowed
        System.out.println("name="+name); // non static - allowed
        System.out.println("college="+college); // static - allowed
        staticMethod1();  // static - allowed
        staticMethod2(); // static - allowed
        nonstaticMethod(); // non static - allowed

    }

    public static void staticMethod1()
    {
        System.out.println("inside static method 1");

      //  System.out.println("rno="+rno); // non static - not allowed
    //    System.out.println("name="+name); // non static - not allowed
        System.out.println("college="+college); // static - allowed
        staticMethod1();  // static - allowed
        staticMethod2(); // static - allowed
      //  nonstaticMethod(); // non static - not allowed
    }

    public static void staticMethod2()
    {
        System.out.println("inside static method 2");
    }

    void nonstaticMethod()
    {
        System.out.println("inside non static method");
    }


    public static void main(String[] args) {

        Student3 s = new Student3();

        s.staticMethod1();
        s.staticMethod2(); // calling using object


        Student3.staticMethod1();
        Student3.staticMethod2(); // calling using class name

    }


}
