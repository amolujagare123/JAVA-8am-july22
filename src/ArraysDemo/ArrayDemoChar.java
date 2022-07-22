package ArraysDemo;

public class ArrayDemoChar {

    public static void main(String[] args) {

        char[] ch = new char[5];

        ch[0] = 'u';
        ch[1] = 'v';
        ch[2] = '2';
        ch[3] = 'd';
        ch[4] = 'r';

        System.out.println("length="+ch.length);

        for(int i=0;i<5;i++)
           System.out.println(ch[i]);


        System.out.println("using for each loop");

        for (char cc : ch)
        {
            System.out.println(cc);
        }



    }
}
