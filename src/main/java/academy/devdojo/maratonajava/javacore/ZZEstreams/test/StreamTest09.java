package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        // Outras formas de criar streams - parte1

        IntStream.rangeClosed(1, 50).filter(n -> (n & 1) == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();

        IntStream.range(1, 50).filter(n -> (n & 1) == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream.of("Sen ", "Cos ", "Tan")
                .map(String::toUpperCase)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        int[] num = {1, 2, 3, 4, 5};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);

        try (Stream<String> lines = Files.lines(Paths.get("arquivos_exercicios/lista3/desafio1/transacoes.csv"))) {
            lines.filter(s -> s.contains("ASSINATURAS")).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
