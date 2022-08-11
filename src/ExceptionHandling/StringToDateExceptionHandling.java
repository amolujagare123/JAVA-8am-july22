package ExceptionHandling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateExceptionHandling {

    public static void main(String[] args)
    {


        String dateStr = "05---09/1985";

        try {
            SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
            Date date = sd.parse(dateStr);
            System.out.println(date);
        }
        catch (Exception e)
        {

        }



    }
}
