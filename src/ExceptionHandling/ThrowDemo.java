package ExceptionHandling;

public class ThrowDemo {

    void checkNumber(int i)  // i -> 1 to 10
    {
        if(i>=1 && i<=10)
            System.out.println("we are safe");
        else
            throw new ArithmeticException("we are in danger");
    }

    public static void main(String[] args) {

        ThrowDemo ob = new ThrowDemo();

        int x  =8;

        ob.checkNumber(12);

        System.out.println("end of the program");
    }
}
