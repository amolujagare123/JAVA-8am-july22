package InheritanceDemos;

public class Society {
    String color = "purple";
}

class House extends Society
{
    String color = "blue";
    void display()
    {
        System.out.println("house color="+color);
        System.out.println("society color="+super.color);
    }

    public static void main(String[] args) {

        House h = new House();
        h.display();
    }
}
