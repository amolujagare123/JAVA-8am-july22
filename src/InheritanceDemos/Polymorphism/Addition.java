package InheritanceDemos.Polymorphism;

public class Addition {

    int a;
    int b;

    void sum()
    {
        int c ;
        c = a + b;
        System.out.println("c="+c);
    }

    void sum(int x)
    {
        int c ;
        c = x + b;
        System.out.println("c="+c);
    }

    void sum(int x,int y)
    {
        int c ;
        c = x + y;
        System.out.println("c="+c);

    }
    void sum(int x,double y)
    {
        double c ;
        c = x + y;
        System.out.println("c="+c);

    }

    void sum(int x,int y,int z)
    {
        int c ;
        c = x + y + z;
        System.out.println("c="+c);
    }

    void sum(double x,double y)
    {
        double c ;
        c = x + y;
        System.out.println("c="+c);
    }

    void sum(String x,String y)
    {
        String c ;
        c = x + y;
        System.out.println("c="+c);
    }



    public static void main(String[] args) {

        Addition ad1 = new Addition();
        ad1.sum();
        ad1.sum(10);
        ad1.sum(10,20);
        ad1.sum(10,20,30);
        ad1.sum(10.56,20.78);
        ad1.sum("Amol-","-Java trainer");

    }
}
