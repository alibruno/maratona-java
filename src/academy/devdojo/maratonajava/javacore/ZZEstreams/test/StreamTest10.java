package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {
        // Outras formas de criar streams - parte2
        //      geração "infinita" de streams

        Stream.iterate(0, n -> n + 2)
                .limit(5)
                .forEach(System.out::println);
        // fib -> 0, 1, 1, 2, 3, 5
        //   0 1
        // (0,1) (1,1) (1,2) (2,3) (3,5)
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], (n[0] + n[1])})
                .limit(10)
                .forEach(a -> System.out.println(Arrays.toString(a)));

        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], (n[0] + n[1])})
                .limit(10)
                .map(n -> n[0])
                .forEach(i -> System.out.print(i + " "));

        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1, 100)).limit(10).forEach(System.out::println);
    }
}
