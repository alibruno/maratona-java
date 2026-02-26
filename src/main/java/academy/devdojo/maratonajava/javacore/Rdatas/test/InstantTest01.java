package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        // Date: miliseg, Instant: nanoseg;
        // Instant é IMUTÁVEL;
        // A contagem começa a partir de 1970;
        Instant now = Instant.now();
        System.out.println(now);
        // Z: zulu time ; Horário "neutro" (UTC);
        // É recomendável guardar a zona.
        System.out.println(LocalDateTime.now());

        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano()); // 999.999.999

        System.out.println(Instant.ofEpochSecond(3));
    }
}