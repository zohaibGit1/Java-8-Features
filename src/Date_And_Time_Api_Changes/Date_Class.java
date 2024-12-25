package Date_And_Time_Api_Changes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date_Class {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate localDate1 = LocalDate.of(2020, 1, 2);
        System.out.println(localDate1);
    }
}
