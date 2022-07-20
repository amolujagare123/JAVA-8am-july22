package studentPractice;

public class GhanashamIfElse {
    public static void main(String[] args) {
        int angle1 = 70;
        int angle2 = 70;
        int angle3 = 90;

        if(angle1==angle2 && angle2==angle3 && angle3==angle1)
            System.out.println("EQUILATERAL Triangle");
        else if( (angle1==angle2 && angle2!=angle3)
                || (angle2==angle3 && angle1!=angle3)
                || (angle3==angle1 && angle2!=angle1))
        System.out.println("RIGHT ANGLE");

        else if (angle1==angle2 || angle2==angle3
                || angle3==angle1)
            System.out.println("ISOSCELES");

        else if (angle1!=angle2 && angle2!=angle3 && angle3!=angle1)
            System.out.println("SCALENE");

    }
}
