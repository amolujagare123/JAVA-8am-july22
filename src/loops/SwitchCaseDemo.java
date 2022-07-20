package loops;

import java.util.Scanner;

public class SwitchCaseDemo {

    public static void main(String[] args) {

        int a = 0 ;
        int b = 0;
        int c;
        String operation = "";
        Scanner sc = new Scanner(System.in);
        // Home work - take input from console and perform the operation



        do {


            System.out.println("Enter operation");
            operation = sc.next();

            System.out.println("Enter a=");
            a = sc.nextInt();

            System.out.println("Enter b=");
            b = sc.nextInt();



            switch (operation) {
                case "add":
                    c = a + b;
                    System.out.println("Addition=" + c);
                    break;

                case "sub":
                    c = a - b;
                    System.out.println("Subtraction=" + c);
                    break;

                case "mult":
                    c = a * b;
                    System.out.println("Multiplication=" + c);
                    break;

                case "div":
                    c = a / b;
                    System.out.println("Division=" + c);
                    break;

                case "exit":
                    break;

                default:
                    System.out.println("wrong choice");
                    break;

            }


        }while (!operation.equals("exit"));

        System.out.println("end of the program");

    }
}
