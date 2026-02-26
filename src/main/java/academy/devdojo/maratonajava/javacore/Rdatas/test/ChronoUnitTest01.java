package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2000, Month.JANUARY, 1, 0, 0);
        System.out.println(ChronoUnit.WEEKS.between(aniversario, LocalDateTime.now()));
    }
}
