package ArraysDemo.TwoDArray;

public class TwoDArrayInt {

    public static void main(String[] args) {

        int[][] a = new int[5][3];

        a[0][0] =89;
        a[0][1] =19;
        a[0][2] =88;

        a[1][0] =29;
        a[1][1] =29;
        a[1][2] =81;

        a[2][0] =39;
        a[2][1] =39;
        a[2][2] =31;

        a[3][0] =30;
        a[3][1] =35;
        a[3][2] =32;

        a[4][0] =34;
        a[4][1] =59;
        a[4][2] =33;

        int row = a.length;
        int col = a[0].length;

        System.out.println("row="+a.length);
        System.out.println("col="+a[0].length);

        for (int i=0; i <a.length ;i++) // rows
        {
            for(int j=0;j<a[0].length;j++) // individual col
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
