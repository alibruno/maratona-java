package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

//1. Order LightNovel by title
//2. Retrieve the first 3 titles light novels with price less than 4

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Coleções: elementos em espaço (dados/memória)
// Streams: sequência de elementos (tempo - não guarda nada)

public class StreamTest01 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(
            List.of(new LightNovel("test4", 3.50),
                    new LightNovel("test1", 4.90),
                    new LightNovel("test3", 15.20),
                    new LightNovel("test7", 2.99),
                    new LightNovel("test6", 6.00),
                    new LightNovel("test2", 1.99),
                    new LightNovel("test5", 3.99))
    );

    public static void main(String[] args) {
//        lightNovelList.sort((l1,l2) -> l1.getTitle().compareTo(l2.getTitle()));
        lightNovelList.sort(Comparator.comparing(LightNovel::getTitle));
        for (LightNovel lightNovel : lightNovelList) {
            System.out.println(lightNovel);
        }

        System.out.println("--------------------------");

        List<String> titlesPriceLess4 = new ArrayList<>();
        for (LightNovel lightNovel : lightNovelList) {
            if (lightNovel.getPrice() <= 4) {
                titlesPriceLess4.add(lightNovel.getTitle());
            }
            if (titlesPriceLess4.size() == 3) {
                break;
            }
        }
        System.out.println(titlesPriceLess4);
    }
}
