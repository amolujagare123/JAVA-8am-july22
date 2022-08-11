package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadFile {

    public static void main(String[] args) throws FileNotFoundException {


        try {
            FileInputStream fis = new FileInputStream("D:\\amol1.txt");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("end of the program");
    }
}
