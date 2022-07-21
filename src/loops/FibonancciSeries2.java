package loops;

public class FibonancciSeries2 {

    public static void main(String[] args) {

        int n = 50;

        int a =0;
        int b =1;

        int sum =0;

        System.out.print(a+" "+b); // 2

   /*     while(sum<=50)
        {
            sum = a + b;
            if(sum<=50)
             System.out.print(" "+sum);

            a = b;
            b = sum;
        }
*/
        for(;sum<=50;)
        {
            sum = a + b;
            if(sum<=50)
                System.out.print(" "+sum);

            a = b;
            b = sum;
        }

    }
}
