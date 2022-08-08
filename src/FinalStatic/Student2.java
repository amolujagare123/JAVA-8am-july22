package FinalStatic;


public class Student2 {

    int rno;
    String name;
    static String college ="ITC";
    String city;

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static void main(String[] args) {

        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
        Student2 s3 = new Student2();


        s1.rno = 1;
        s1.name="Ananta";
        s1.display();

        s2.rno = 2;
        s2.name="Sreedevi";
        s2.college = "PICT";
        s2.display();

        s3.rno = 3;
        s3.name="Sheetal";
        s3.display();


        s1.display();


    }


}
