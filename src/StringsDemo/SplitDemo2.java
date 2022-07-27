package StringsDemo;

public class SplitDemo2 {

    public static void main(String[] args) {

        String str = "Hey baby you are so lovely";

        String[] stArr = str.split(" ");

        for (int i=0;i<stArr.length;i++)
        {
           //System.out.println(stArr[i]);

            String tempString = stArr[i];
            int l = tempString.length();

            if (tempString.charAt(l-1)=='y')
                System.out.println(stArr[i]);
        }



    }
}
