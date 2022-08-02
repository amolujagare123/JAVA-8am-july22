package InheritanceDemos;

public class TestInheritance4 {

    public static void main(String[] args) {

        Animal1 a = new Animal1();
        a.eat();

        Mammal m = new Mammal();
        m.walk();
        m.eat();

        Reptile r = new Reptile();
        r.crowl();
        r.eat();

        Tiger t = new Tiger();
        t.roar();
        t.walk();
        t.eat();

    }


}

class Animal1
{
    void eat()
    {
        System.out.println("eat");
    }
}

class Reptile extends Animal
{
    void crowl()
    {
        System.out.println("crowl");
    }
}

class Mammal extends Animal
{
    void walk()
    {
        System.out.println("walk");
    }
}


class Tiger extends Mammal
{
    void roar()
    {
        System.out.println("roar");
    }
}


