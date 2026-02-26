package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
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
        Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();
        for (LightNovel lightNovel : lightNovelList) {
            switch (lightNovel.getCategory()) {
                case DRAMA -> drama.add(lightNovel);
                case FANTASY -> fantasy.add(lightNovel);
                case ROMANCE -> romance.add(lightNovel);
            }
        }
        categoryLightNovelMap.put(Category.DRAMA, drama);
        categoryLightNovelMap.put(Category.FANTASY, fantasy);
        categoryLightNovelMap.put(Category.ROMANCE, romance);
        System.out.println(categoryLightNovelMap);

        Map<Category, List<LightNovel>> collect = lightNovelList.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}
