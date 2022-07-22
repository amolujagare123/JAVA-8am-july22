package ArraysDemo;

public class ArrayIntAddAll {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 89;
        a[1] = 22;
        a[2] = 45;
        a[3] = 11;
        a[4] = 23;

        int sum = 0;

        System.out.println("length="+a.length);

        for(int i=0;i<5;i++)
        {
            sum = sum + a[i];
        }


        System.out.println("Addition="+sum);

    }
}
