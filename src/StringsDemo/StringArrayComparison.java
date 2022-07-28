package StringsDemo;

public class StringArrayComparison {

    public static void main(String[] args) {

        String[] stArr1 = {
                "Ashish",
                "Bharat",
                "Indukala",
                "Kapil",
                "Karthik",
                "Kavitha",
                "Madhavi"
        };

        String[] stArr2 = {
                "Ashish",
                "Bharat",
                "Indukala2",
                "Kapil",
                "Karthik1",
                "Kavitha",
                "Madhavi"
        };


        boolean flag = true;

        if(stArr1.length==stArr2.length) {

            for (int i = 0; i <stArr1.length ; i++)
            {
                if(stArr1[i]!=stArr2[i])
                {
                    flag = false;
                    System.out.println(stArr2[i]);
                }

            }

            if (flag)
                System.out.println("all the elements in both the string array are equal");
            else
                System.out.println("Above elements in second array are not equal");

        }
        else
            System.out.println("arrays are not with similar length");


    }

}
