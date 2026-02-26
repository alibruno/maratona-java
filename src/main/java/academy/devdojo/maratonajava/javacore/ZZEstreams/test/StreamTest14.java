package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.groupingBy;

public class StreamTest14 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(
            List.of(new LightNovel("test4", 3.50, Category.DRAMA),
                    new LightNovel("test1", 4.90, Category.DRAMA),
                    new LightNovel("test3", 15.20, Category.FANTASY),
                    new LightNovel("test3", 15.20, Category.FANTASY),
                    new LightNovel("test7", 2.99, Category.ROMANCE),
                    new LightNovel("test6", 6.00, Category.DRAMA),
                    new LightNovel("test2", 1.99, Category.ROMANCE),
                    new LightNovel("test5", 3.99, Category.ROMANCE))
    );

    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovelList
                .stream()
                .collect(groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        Map<Category, Optional<LightNovel>> collect1 = lightNovelList
                .stream()
                .collect(
                        groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)))
                );
        System.out.println(collect1);

        //  com o metodo collectingAndThen, primeiro vai pegar o valor máximo e então chama o Optional::get, que retorna o valor em vez de retornar como Optional
        Map<Category, LightNovel> collect2 = lightNovelList
                .stream()
                .collect(
                        groupingBy(
                                LightNovel::getCategory,
                                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)
                        )
                );
        System.out.println(collect2);

        // Outra forma de escrever o map anterior
        Map<Category, LightNovel> collect3 = lightNovelList.stream()
                .collect(
                        Collectors.toMap(
                                LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))
                        )
                );
        System.out.println(collect3);

    }
}
