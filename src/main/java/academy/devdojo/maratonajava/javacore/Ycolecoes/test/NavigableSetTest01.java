package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.*;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator()); // Normalmente, coleções com nome "Tree" requerem que as classes implementem
        // Comparable ou seja criado um Comparator
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator()); // Set não permite elementos duplicados na coleção
        mangas.add(new Manga(5L, "Naruto", 9.9, 0));
        mangas.add(new Manga(1L, "Dragon Ball Z", 15.7, 7));
        mangas.add(new Manga(7L, "Yu Yu Hakusho", 30.4, 11));
        mangas.add(new Manga(3L, "Pokemon", 80.41, 0));
        mangas.add(new Manga(10L, "Ippo", 80.41, 0)); // Tem o mesmo preço de pokemon -> não é inserido. (BASEADA NO COMPARATOR)
        mangas.add(new Manga(10L, "Ippo 2.0", 80.01, 0));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        // Quando usar? Se a classe implementar Comparable ou possua um Comparator, e seja necessário fazer adições, o TreeSet<> irá
        // reordenar a coleção baseada no Comparable/Comparator em O(log n).
        // Caso a lista não precise de ordenação, é melhor utilizar HashSet<>.

        // Obs: o TreeSet<> não segue as regras do Set, ou seja, para verificar se dois objetos são iguais, ele não utiliza o equals()>
        // e sim no metodo compareTo/Comparator.

        Manga myHero = new Manga(22L, "My Hero Academia", 30.4, 4);
        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println("-------------------");
        System.out.println(mangas.lower(myHero));
        System.out.println(mangas.floor(myHero));
        System.out.println(mangas.higher(myHero));
        System.out.println(mangas.ceiling(myHero));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst()) ; //Remove o 1º elemento e o retorna.
//        System.out.println(mangas.pollLast()) ; //Remove o último elemento e o retorna.
        System.out.println(mangas.size());

    }
}
