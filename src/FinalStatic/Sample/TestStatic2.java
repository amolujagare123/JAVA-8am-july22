package FinalStatic.Sample;


import FinalStatic.Student3;

public class TestStatic2 {

     public static void main(String[] args) {

        Student3.college = "ABCD";
        Student3.staticMethod1();
        Student3.staticMethod2();

        Student3 ob = new Student3();
        ob.display();



    }
}
