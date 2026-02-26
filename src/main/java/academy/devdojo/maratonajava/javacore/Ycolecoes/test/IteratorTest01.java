package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "Naruto", 9.9, 0));
        mangas.add(new Manga(1L, "Dragon Ball Z", 15.7, 7));
        mangas.add(new Manga(7L, "Yu Yu Hakusho", 30.4, 11));
        mangas.add(new Manga(3L, "Pokemon", 80.41, 0));

        Iterator<Manga> mangaIterator = mangas.iterator(); // Checa antes de fazer alguma ação; Ex: fila de banco (se tiver alguma pessoa na fila, o funcionário o chama. Repete-se o processo até o momento em que não houver pessoas na fila).
//        while (mangaIterator.hasNext()){
//            if (mangaIterator.next().getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }
        mangas.removeIf(manga -> manga.getQuantidade() == 0); // manga -> Variável de referência.
        System.out.println(mangas);
    }
}
