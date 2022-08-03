package InheritanceDemos;

public class Society {

   /* Society()
    {
        System.out.println("inside society constructor");
    }*/

    Society(int n)
    {
        System.out.println("inside society constructor");
        System.out.println("there are houses = "+n);
    }

    String color = "purple";

    void getMaintainance()
    {
        System.out.println("getMaintainance society");
    }
}

class House extends Society
{
    House(int x)
    {
        super(x);
        System.out.println("inside house constructor");
    }
    String color = "blue";

    void getMaintainance()
    {
        System.out.println("getMaintainance House");
    }

    void display()
    {
        System.out.println("house color="+color);
        System.out.println("society color="+super.color);
        getMaintainance();
        super.getMaintainance();
    }

    public static void main(String[] args) {

        House h = new House(23);
        h.display();
    }
}
