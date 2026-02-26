package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
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
        boolean b = lightNovelList.stream().anyMatch(ln -> ln.getPrice() > 16);
        System.out.println(b);
        System.out.println(lightNovelList.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(lightNovelList.stream().noneMatch(ln -> ln.getPrice() <= 0));

        lightNovelList.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);

        lightNovelList.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);

        lightNovelList.stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
