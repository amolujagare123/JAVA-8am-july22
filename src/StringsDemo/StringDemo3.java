package StringsDemo;

public class StringDemo3 {

    public static void main(String[] args) {

        String str = "this is a java class";
        System.out.println(str);

        // if j is present in the string make it capital

        String tempString = "";

        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i)=='j')
                tempString = tempString + 'J';
            else
                tempString = tempString + str.charAt(i);
        }

        System.out.println(tempString);
    }
}
