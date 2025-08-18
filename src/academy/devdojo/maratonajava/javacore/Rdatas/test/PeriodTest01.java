package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfter2Years4Mounths = LocalDate.now().plusYears(2).plusMonths(4);
        Period p1 = Period.between(now,nowAfter2Years4Mounths);
        Period p2 = Period.ofWeeks(13);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p2.getDays()); // getMonths() não é normalizado.
        // Para conversão, utiliza-se outra classe chamada ChronoUnit.

        System.out.println(now.until(now.plusDays(p2.getDays()), ChronoUnit.MONTHS));
    }
}
