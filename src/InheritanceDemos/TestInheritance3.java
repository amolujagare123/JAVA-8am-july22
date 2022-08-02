package InheritanceDemos;

public class TestInheritance3 {

    public static void main(String[] args) {

        Login login = new Login();
        login.doLogin();

        AddUser addUser = new AddUser();
        addUser.doLogin();
        addUser.createUser();

        AddSupplier addSupplier = new AddSupplier();
        addSupplier.doLogin();
        addSupplier.createSupplier();


    }
}

class Login
{
    void doLogin()
    {
        System.out.println("do Login");
    }
}

class AddUser extends Login
{
    void createUser()
    {
        System.out.println("add user");
    }
}

class AddSupplier extends Login
{
    void createSupplier()
    {
        System.out.println("add supplier");
    }
}
