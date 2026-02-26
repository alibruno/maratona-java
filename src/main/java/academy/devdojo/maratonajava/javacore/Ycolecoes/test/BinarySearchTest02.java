package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Naruto", 9.9));
        mangas.add(new Manga(1L, "Dragon Ball Z", 15.7));
        mangas.add(new Manga(7L, "Yu Yu Hakusho", 30.4));
        mangas.add(new Manga(3L, "Pokemon", 80.41));
//        Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Manga mangaASerBuscado = new Manga(3L, "Pokemon", 80.41);
        System.out.println(Collections.binarySearch(mangas, mangaASerBuscado, mangaByIdComparator));
    }
}
