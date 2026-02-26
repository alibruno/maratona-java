package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Antony");
        Consumidor consumidor2 = new Consumidor("Sarah");

        Manga manga1 = new Manga(5L, "Naruto", 9.9);
        Manga manga2 = new Manga(1L, "Dragon Ball Z", 15.7);
        Manga manga3 = new Manga(7L, "Yu Yu Hakusho", 30.4);
        Manga manga4 = new Manga(3L, "Pokemon", 80.41);

        List<Manga> mangaConsumidor1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidor2List = List.of(manga3, manga4);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangaConsumidor1List);
        consumidorMangaMap.put(consumidor2, mangaConsumidor2List);
        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.println("--" + entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("------" + manga.getNome());
            }

        }

    }
}
