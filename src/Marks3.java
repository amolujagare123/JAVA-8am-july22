public class Marks3 {

    public static void main(String[] args) {

        int marks = 75;

        if(marks<40)
            System.out.println("Fail");

        else if (marks >= 40 && marks < 50)
            System.out.println("Pass");

        else {
            System.out.println("pass");


             if (marks >= 50 && marks < 60) {

                System.out.println("Second Class");
            } else if (marks >= 60 && marks < 70) {

                System.out.println("First class");
            } else if (marks >= 70 && marks <= 100) {

                System.out.println("Distinction");
            }
        }

      /*  else
            System.out.println("Distinction");*/

    }
}
