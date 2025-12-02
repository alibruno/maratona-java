package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
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
        // .map(-) = Stream <Double> (trabalha com wrappers)
        lightNovelList.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price <= 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        // .mapToDouble(-) = DoubleStream (trabalha com tipos primitivo -> melhor performace)
        double sum = lightNovelList.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price <= 3)
                .sum();

        System.out.println(sum);

    }
}
