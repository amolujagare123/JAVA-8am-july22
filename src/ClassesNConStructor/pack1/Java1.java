package ClassesNConStructor.pack1;

public class Java1 {

    public int a;
    protected double d;
    private char c;
    protected String str;

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        Java1 ob = new Java1();

        ob.a =110;
        ob.d = 89.6;
        ob.c = 'h';
        ob.str = "amol";

        ob.display();



    }

}
