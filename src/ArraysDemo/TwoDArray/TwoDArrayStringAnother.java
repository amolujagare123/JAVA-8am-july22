package ArraysDemo.TwoDArray;

public class TwoDArrayStringAnother {

    public static void main(String[] args) {

        String[][] stArr = {
                {"Anirban","Ananta","Arati"},
                {"Arun","Ashish","Indukala"},
                {"Kapil","Karthik","Kavitha"}, // 2, 1
                {"Madhavi","Modin","Modukari"},
                {"Monin","Namrata","Sweety"}

        };

     //   System.out.println(stArr);

        for (int i=0;i< stArr.length;i++)
        {
            for (int j=0;j< stArr[0].length;j++)
            {
             //   if (stArr[i][j].equals("Karthik"))
                System.out.print(stArr[i][j]+"\t");
            }
            System.out.println();
        }

    //    System.out.println("Specific name="+stArr[2][1]);
    }
}
