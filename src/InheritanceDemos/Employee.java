package InheritanceDemos;

public /*final*/ class Employee {

    int salary = 35000;

    void attendance()
    {
        System.out.println("Attendance");
    }
}

class Programmer extends Employee{
    int bonus = 5000;

    void coding()
    {
        System.out.println("Coding");
    }
}

class TestInheritance
{
    public static void main(String[] args) {

        Programmer p = new Programmer();

        System.out.println(p.bonus);
        p.coding();

        System.out.println(p.salary);
    }
}