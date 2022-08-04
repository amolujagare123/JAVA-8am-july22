package Methods;

import ClassesNConStructor.MyClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TakingArguments {

    void display()
    {
        System.out.println("this is a method with no argument");
    }

    void method1(int a)
    {
        System.out.println("method1-> a="+a);
    }

    void method2(int a,int b)
    {
        System.out.println("method2-> a="+a);
        System.out.println("method2-> b="+b);
    }


    void method3(int a,double b,char c)
    {
        System.out.println("method3-> a="+a);
        System.out.println("method3-> b="+b);
        System.out.println("method3-> c="+c);
    }

    void printMyArray(int[] ar)
    {
        for (int i=0;i<ar.length;i++)
            System.out.print(ar[i]+"\t");

        System.out.println();
    }

    void printMyTwoDArray(String[][] stArr)
    {
        for (int i=0;i<stArr.length;i++)
        {
            for (int j=0;j<stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+"\t");
            }
            System.out.println();
        }

    }

    void getMyString(String str)
    {
        System.out.println("str="+str);
    }

    void printDateInNormalFormat(Date date)
    {
        String dateStr = new SimpleDateFormat("dd-MM-yy").format(date);
        System.out.println(dateStr);
    }

    void setMyClassObject(MyClass obj)
    {
        obj.a = 90;
        obj.d = 34.5;
        obj.c = 'g';
        obj.str ="Selenium";
    }

    public static void main(String[] args) {

        TakingArguments ob = new TakingArguments();
        ob.display();
        ob.method1(12);
        ob.method2(11,89);

        int[] array = {12,45,34,22,67,88,99};

        ob.printMyArray(array);

        String[][] twoDAraay = {
                {"Amol","Ananta","Arti","Arun"},
                {"Ashish","Bharath","Indukala","Kapil"},
                {"Kavitha","Madhavi","Modin","sruthi"}
        };

        ob.printMyTwoDArray(twoDAraay);

        ob.getMyString("amol");
        ob.printDateInNormalFormat(new Date());

        MyClass myClass = new MyClass();

        System.out.println("===== Calling display Method ====");
        myClass.display();

        ob.setMyClassObject(myClass);

        System.out.println("===== Calling display Method ====");
        myClass.display();
    }
}
