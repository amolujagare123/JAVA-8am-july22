package Methods;

import ClassesNConStructor.MyClass;

public class ReturningValue3 {


      /*  Object getTheLoadedObject()
        {
            MyClass myClass = new MyClass();
            myClass.a = 19;
            myClass.d = 12.4;
            myClass.c = 'j';
            myClass.str = "bharath";

            return myClass;
        }*/

        MyClass getTheLoadedObject()
        {
            MyClass myClass = new MyClass();
            myClass.a = 19;
            myClass.d = 12.4;
            myClass.c = 'j';
            myClass.str = "bharath";

            return myClass;
        }




    public static void main(String[] args) {


        ReturningValue3 ob = new ReturningValue3();


       /* MyClass obj = (MyClass) ob.getTheLoadedObject();
        obj.display();*/

        MyClass myClass1 = ob.getTheLoadedObject();
        myClass1.display();



    }
}
