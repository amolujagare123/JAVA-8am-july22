package Methods;

public class ReturningValue2 {


    int[] getMyArray()
    {
        int[] x = {45,12,33,11,45,66,22,90,11};

        return x;
    }


    String[][] getMyStrings()
    {
        String[][] twoDAraay = {
                {"Amol","Ananta","Arti","Arun"},
                {"Ashish","Bharath","Indukala","Kapil"},
                {"Kavitha","Madhavi","Modin","sruthi"}
        };

        return twoDAraay;
    }



    public static void main(String[] args) {


        ReturningValue2 ob = new ReturningValue2();

        int[] a = ob.getMyArray();

        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+"\t");


        String[][] stArr = ob.getMyStrings();

        System.out.println();

        for (int i=0;i<stArr.length;i++)
        {
            for (int j=0;j<stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
