package ArraysDemo;

public class AnotherArrayInt {

    public static void main(String[] args) {

        int[] a = {23,4,5,12,5,122,2112,56,89,100, 67};

        for (int i=0; i<a.length ;i++)
            System.out.println(a[i]);

        System.out.println("using for each loop");

        for(int x:a)
        {
            System.out.println(x);
        }


    }
}
