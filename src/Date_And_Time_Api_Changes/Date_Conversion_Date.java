package Date_And_Time_Api_Changes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Conversion_Date {
    public static void main(String[] args) throws Exception {

        Date date = new Date();
        System.out.println(date);

        // dd/mm/yyyy
        // Conversion Date to String
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MMMM/yyyy");
        String format = simpleDateFormat.format(date);
        System.out.println(format);


        // Conversion of String to Date
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MMMM/yyyy");
        Date parse = simpleDateFormat1.parse(format);
        System.out.println(parse);


        // To represent date in the sql
     }
}
