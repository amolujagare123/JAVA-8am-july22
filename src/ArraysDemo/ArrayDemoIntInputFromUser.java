package ArraysDemo;

import java.util.Scanner;

public class ArrayDemoIntInputFromUser {

    public static void main(String[] args) {

        int[] a = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i=0;i<a.length;i++ ) {

            System.out.println("Enter value for a["+i+"]=");

            a[i] = sc.nextInt();

        }




        System.out.println("length="+a.length);

        for(int i=0;i<5;i++)
           System.out.println(a[i]);



    }
}
