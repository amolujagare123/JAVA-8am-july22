package Abstraction;

public interface MyInterface {

    void start();
    void run();

    default void method1() // non abstract
    {
        System.out.println("method1");
    }

    static void method2()
    {
        System.out.println("method2");
    }

    private void method3()
    {
        System.out.println("method3");
    }
}

class AnotherClass
{

}

class childInterface extends AnotherClass implements MyInterface
{
    public void run()
    {
        System.out.println("run");
    }

    public void start()
    {
        System.out.println("start");
    }

}
