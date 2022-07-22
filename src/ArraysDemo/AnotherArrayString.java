package ArraysDemo;

public class AnotherArrayString {

    public static void main(String[] args) {
        
        String[] stArr = {
                "Ashish",
                "Bharat",
                "Indukala",
                "Kapil",
                "Karthik",
                "Kavitha",
                "Madhavi"
        };

    /*    for (int i=0; i<stArr.length ;i++)
            System.out.println(stArr[i]);*/

        for (int i= stArr.length-3; i>=0 ;i--)
            System.out.println(stArr[i]);


        System.out.println("using for each loop");

        for (String s : stArr)
        {
            System.out.println(s);
        }


    }
}
