package FinalStatic;

public class FinalStatic {

   /* final*/ int speed = 100;

    void change()
    {
        speed = 200;
    }

    public static void main(String[] args) {

        FinalStatic ob = new FinalStatic();
        ob.change();
        System.out.println(ob.speed);

    }
}
