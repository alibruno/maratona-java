package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
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
        System.out.println(lightNovelList.size());
        System.out.println(lightNovelList.stream().count());
        System.out.println(lightNovelList.stream().collect(Collectors.counting()));

        lightNovelList.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        lightNovelList.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

        lightNovelList.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);
        System.out.println(lightNovelList.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));

        DoubleSummaryStatistics collect = lightNovelList.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);

        String titles = lightNovelList.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);
    }
}
