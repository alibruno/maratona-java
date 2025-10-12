package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(5L, "Naruto", 9.9, 0));
        mangas.add(new Manga(1L, "Dragon Ball Z", 15.7, 7));
        mangas.add(new Manga(7L, "Yu Yu Hakusho", 30.4, 11));
        mangas.add(new Manga(3L, "Pokemon", 80.41, 0));
        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
