package controlStructure;

public class SwitchCaseDemo {

    public static void main(String[] args) {

        int a = 10 ;
        int b = 0;
        int c;

        // Home work - take input from console and perform the operation

        String operation = "div";

        switch (operation)
        {
            case "add" : c = a+b;
                System.out.println("Addition="+c);
                break;

            case "sub" : c = a-b;
                System.out.println("Subtraction="+c);
                break;

            case "mult" : c = a*b;
                System.out.println("Multiplication="+c);
                break;

            case "div" : c = a/b;
                System.out.println("Division="+c);
                break;

            default:
                System.out.println("wrong choice");
                break;

        }

        System.out.println("end of the program");

    }
}
