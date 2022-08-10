package Abstraction;

public abstract class AbstractDemo {

    abstract void run();
    abstract void start();

    void display()
    {
        System.out.println("display");
    }
}

class ChildAbstract extends AbstractDemo
{
    void run()
    {
        System.out.println("run");
    }

    void start()
    {
        System.out.println("start");
    }

    public static void main(String[] args) {

        AbstractDemo ob = new ChildAbstract();

        ob.display();
        ob.start();
        ob.run();
    }
}