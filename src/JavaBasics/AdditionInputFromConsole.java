package JavaBasics;

import java.util.Scanner;

public class AdditionInputFromConsole {

    public static void main(String[] args) {

        int a=0;
        int b=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a = ");
        a = sc.nextInt();

        System.out.println("Enter b = ");
        b = sc.nextInt();


        int c;

        c = a + b;

        System.out.println("JavaBasics.Addition="+c);
    }
}
