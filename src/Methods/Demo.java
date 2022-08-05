package Methods;

public class Demo {

    public static void main(String[] args) {

        String[][] twoDAraay = {  {"Amol","Ananta","Arti","Arun"},
                {"Ashish","Bharath","Indukala","Kapil","bharath"},
                {"Kavitha","Madhavi","Modin","sruthi"}
        };

        int row = twoDAraay.length; // 3
        int col = twoDAraay[1].length; // exp=5

        System.out.println("row="+row);
        System.out.println("col="+col);

        for (int i=0;i<twoDAraay.length;i++)
        {
            for (int j=0;j<twoDAraay[i].length;j++)
            {
                System.out.print(twoDAraay[i][j]+"\t");
            }
            System.out.println();
        }




    }
}

