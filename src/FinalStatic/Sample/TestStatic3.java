package FinalStatic.Sample;


import FinalStatic.Student3;
/*
import static FinalStatic.Student3.college; // importing statically
import static FinalStatic.Student3.staticMethod1;
import static FinalStatic.Student3.staticMethod2;
*/

import static FinalStatic.Student3.*;

public class TestStatic3 {

    public static void main(String[] args) {

        college = "ABCD";
        staticMethod1();
        staticMethod2();

        // if you import static members statically
        // then you even don't need class name
        // to call them


    }
}
