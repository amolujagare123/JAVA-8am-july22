package ExceptionHandling;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] a = new int[5];

        try {
            a[0] = 11;
            a[1] = 12;
            a[2] = 21;
            a[3] = 13;
            a[4] = 31;
   //         a[5] = 14;
        }
        catch (Exception e)
        {
            System.out.println(e);
            System.out.println(e.getClass());
            System.out.println(e.getMessage());

            e.printStackTrace();
        }
        finally {
            System.out.println("inside finally");
        }

        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);

    }
}
