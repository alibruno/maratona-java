package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Naruto", 9.9));
        mangas.add(new Manga(1L, "Dragon Ball Z", 15.7));
        mangas.add(new Manga(7L, "Yu Yu Hakusho", 30.4));
        mangas.add(new Manga(3L, "Pokemon", 80.41));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("-----------------------------------");
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("-----------------------------------");
//        Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
