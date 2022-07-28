package ClassesNConStructor;

public class MyClass3 {

    int a=10;
    double d;
    char c;
    String str;

    MyClass3()
    {
        a = 19;
        d =9.8;
        c = 'g';
        str = "selenium";
    }

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        MyClass3 ob = new MyClass3();
        ob.display();

    }
}
