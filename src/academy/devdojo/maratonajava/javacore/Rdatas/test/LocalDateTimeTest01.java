package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.parse("2012-12-12");
        LocalTime localTime = LocalTime.parse("11:51:01");
        LocalDateTime localDT2 = LocalDateTime.parse("2015-01-01T09:19:09");
        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDT2);

        System.out.println("------------------------------------");
        // "Junção" da LocalDate e LocalTime
        LocalDateTime ldt1 = localDate.atTime(localTime);
        LocalDateTime ldt2 = localTime.atDate(localDate);

        System.out.println(ldt1);
        System.out.println(ldt2);
    }
}
