package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        // Baseado em segundos e nanosegundos
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfter2Years = LocalDateTime.now().plusYears(2).plusMinutes(8);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);
        Duration d1 = Duration.between(now, nowAfter2Years);
        Duration d2 = Duration.between(timeNow, timeMinus7Hours);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        Duration d4 = Duration.ofDays(9);
        Duration d5 = Duration.of(3, ChronoUnit.HALF_DAYS);
        System.out.println(d4);
        System.out.println(d5);

//        Duration test = Duration.between(LocalDate.now(), LocalDate.now().plusYears(10));
//        System.out.println(test);

    }
}
