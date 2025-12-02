package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.mapping;

public class StreamTest15 {
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
        Map<Category, DoubleSummaryStatistics> collect = lightNovelList
                .stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        Map<Category, Set<Promotion>> collect1 = lightNovelList
                .stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, mapping(getPromotionFunction(), Collectors.toSet())));
        System.out.println(collect1);

        Map<Category, LinkedHashSet<Promotion>> collect2 = lightNovelList
                .stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, mapping(getPromotionFunction(), Collectors.toCollection(LinkedHashSet::new))));
        System.out.println(collect2);
    }

    private static Function<LightNovel, Promotion> getPromotionFunction() {
        return ln -> (ln.getPrice() < 6) ? UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }

}
