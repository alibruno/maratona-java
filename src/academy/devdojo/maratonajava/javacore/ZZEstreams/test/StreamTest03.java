package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(
            List.of(new LightNovel("test4", 3.50),
                    new LightNovel("test1", 4.90),
                    new LightNovel("test3", 15.20),
                    new LightNovel("test3", 15.20),
                    new LightNovel("test7", 2.99),
                    new LightNovel("test6", 6.00),
                    new LightNovel("test2", 1.99),
                    new LightNovel("test5", 3.99))
    );

    public static void main(String[] args) {
//        lightNovelList.forEach(System.out::println) > lightNovelList.stream().forEach(System.out::println); (DESPERDIÇA PROCESSAMENTO)
        lightNovelList.forEach(System.out::println);

        Stream<LightNovel> stream = lightNovelList.stream();

        long count = stream
                .distinct() // O equals() e hashCode() devem estar sobrescritos na classe encapsulada pela stream.
                .filter(ln -> ln.getPrice() <= 4)
                .count();

        // Nota: não é possível manusear a stream após seu fechamento.
        System.out.println(count);

    }
}
