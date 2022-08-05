package Methods;

public class ReturningValue1 {

    int getMyInt()
    {
        System.out.println("returning int");
        return  50;
    }

    boolean getMyBoolean(boolean x)
    {
        return x;
    }

    char getMyChar(char c)
    {
        return c;
    }

    int getMyInt1()
    {
        System.out.println("returning int");

        boolean flag=true;

        if(flag)
          return  50;
        else
            return 100;
    }


    String getMyString()
    {
        String str ="Java";
        return str;
    }

    public static void main(String[] args) {

        /*int x;
        x = 10 ;
        int y = 3 + x;
        int z = x ;
        System.out.println(x);*/

        ReturningValue1 ob = new ReturningValue1();

        int x = ob.getMyInt();

        System.out.println(x);
        System.out.println(ob.getMyInt());

        System.out.println("Language="+ob.getMyString());

        System.out.println("Boolean="+ob.getMyBoolean(true));


        char ch = ob.getMyChar('i');
        System.out.println("ch="+ch);
    }
}
