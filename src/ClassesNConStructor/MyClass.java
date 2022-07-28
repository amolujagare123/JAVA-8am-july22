package ClassesNConStructor;

public class MyClass {

    int a;
    double d;
    char c;
    String str;

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

      /*  int x ;
        x = 10;
        System.out.println(x);*/

        MyClass ob = new MyClass();

        ob.a =110;
        ob.d = 89.6;
        ob.c = 'h';
        ob.str = "amol";
        ob.display();

       // System.out.println(ob.a);





       MyClass myClass = new MyClass();

        myClass.a = 11;
        myClass.d = 86;
        myClass.c = 'c';
        myClass.str = "java";

        myClass.display();



    }
}
