package InheritanceDemos.Polymorphism;

public class OverridingDemo {

     void sampleMethod()
    {
        System.out.println("Sample method Parent");
    }
}

class ChildOverridden extends OverridingDemo
{
    void sampleMethod() // overridden Method
    {
        System.out.println("Sample method Child");
    }

    void callingMethod()
    {
        sampleMethod();
        super.sampleMethod();
    }

    public static void main(String[] args) {

        OverridingDemo ob = new ChildOverridden();
        ob.sampleMethod();
    }
}
