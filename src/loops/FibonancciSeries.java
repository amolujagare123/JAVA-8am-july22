package loops;

public class FibonancciSeries {

    public static void main(String[] args) {

        int n = 8;

        int a =0;
        int b =1;

        int sum =0;

        System.out.print(a+" "+b); // 2

       /* for (int i=3;i<=n;i++) // 6
        {
            sum = a + b;
            System.out.print(" "+sum);
            a = b;
            b = sum;
        }*/

        for (int i=1;i<=n-2;i++) // 6
        {
            sum = a + b;
            System.out.print(" "+sum);
            a = b;
            b = sum;
        }

    }
}
