package ClassesNConStructor;

public class ParameterizedContructorThis {

    int a;
    double d;
    char c;
    String str;

    ParameterizedContructorThis(int a, double d , char c , String str)
    {
        this.a = a;
        this.d = d;
        this.c = c;
        this.str = str;
    }

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        ParameterizedContructorThis ob = new ParameterizedContructorThis(5,6.7,'j',"java");
        ob.display();

    }
}
