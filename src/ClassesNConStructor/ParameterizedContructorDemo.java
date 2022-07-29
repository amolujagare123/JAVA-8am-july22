package ClassesNConStructor;

public class ParameterizedContructorDemo {

    int a=10;
    double d;
    char c;
    String str;

    ParameterizedContructorDemo(int x, double y , char ch , String s)
    {
        a = x;
        d = y;
        c = ch;
        str = s;
    }

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        ParameterizedContructorDemo ob = new ParameterizedContructorDemo(5,6.7,'j',"java");
        ob.display();

    }
}
