package Abstraction;

public interface MyInterface2 {

    void start();
    void run();
    void display();
}

interface AnotherInterface
{
    void display();
}


class ChildInteface2 implements MyInterface2,AnotherInterface
{


    public void start() {
        System.out.println("start");
    }


    public void run() {
        System.out.println("run");
    }


    public void display() {
        System.out.println("display");
    }


    public static void main(String[] args) {

    }
}
