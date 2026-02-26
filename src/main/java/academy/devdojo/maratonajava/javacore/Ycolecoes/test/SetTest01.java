package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.*;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>(); // Set não permite elementos duplicados na coleção
        mangas.add(new Manga(5L, "Naruto", 9.9, 0));
        mangas.add(new Manga(1L, "Dragon Ball Z", 15.7, 7));
        mangas.add(new Manga(7L, "Yu Yu Hakusho", 30.4, 11));
        mangas.add(new Manga(7L, "Yu Yu Hakusho", 30.4, 11));
        mangas.add(new Manga(3L, "Pokemon", 80.41, 0));
        // HashSet -> A ordem é definida por meio do hash
        // A ordem de inserção pode ser mantida se for instanciado um objeto do tipo LinkedHashSet.
        // Ao inserir valor duplicado, o equals() barrará a inserção. Por isso, o hashCode() e equals() devem estar sincronizados.
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
