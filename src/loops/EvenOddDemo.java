package loops;

public class EvenOddDemo {

    public static void main(String[] args) {

        // print 1 to 10 number - also print even
        // odd in front of each number

        for (int i=1 ; i<=10 ; i++) {

            if(i%2==0)
               System.out.println(i + " even");
            else
                System.out.println(i + " odd");
        }

    }
}
