package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        // LocalDate é IMUTÁVEL
        System.out.println(new Date());
        System.out.println(Calendar.getInstance().getTime());
        LocalDate localDate = LocalDate.of(1999, Month.JANUARY, 28);
        LocalDate agora = LocalDate.now(); // Instancia já levando a zona default em consideração.

        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.lengthOfMonth());
        System.out.println(localDate.isLeapYear()); // return: boolean; Ano bissexto
        System.out.println(localDate.get(ChronoField.YEAR));
        System.out.println(localDate.get(ChronoField.DAY_OF_MONTH));
        System.out.println(localDate);
        System.out.println(agora);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
    }
}
