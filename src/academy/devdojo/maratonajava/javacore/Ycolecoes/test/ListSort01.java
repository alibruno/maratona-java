package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Naruto");
        mangas.add("Dragon Ball Z");
        mangas.add("Yu Yu Hakusho");
        mangas.add("Pokemon");
        Collections.sort(mangas);

        List<Double> salarios = new ArrayList<>();
        salarios.add(1000.20);
        salarios.add(900.95);
        salarios.add(1512.0);
        salarios.add(9999.99);
        Collections.sort(salarios);

        for (String manga : mangas) {
            System.out.println(manga);
        }

        System.out.println(salarios);

        new Manga(11111111L, null, 0.0);
    }
}
