package ArraysDemo;

public class ArrayDemoString {

    public static void main(String[] args) {

        String[] stArr = new String[5];

        stArr[0] = "Ananta";
        stArr[1] = "Abhishek" ;
        stArr[2] = "Anirban";
        stArr[3] = "Arti";
       // stArr[4] = "Arun";

        System.out.println("length="+stArr.length);

      /*  for(int i=0;i<5;i++)
           System.out.println(stArr[i]);
*/
        for(int i=0;i<5;i++) {

            if(stArr[i]==null)
              System.out.println("null is present at index-->"+i);
        }



    }
}
