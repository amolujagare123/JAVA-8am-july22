package ArraysDemo.TwoDArray;

public class TwoDArrayIntAnother {

    public static void main(String[] args) {
//{   {67,34,99} , {68,35,100} , {68,35,100} ,{68,35,100} , {68,35,100} }
        int[][] a = {   {67,34,99} ,
                {68,35,100} ,
                {68,35,100} ,
                {68,35,100} ,
                {68,35,100} };

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
