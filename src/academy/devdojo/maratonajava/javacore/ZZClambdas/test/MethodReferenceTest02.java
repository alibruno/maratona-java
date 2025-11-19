package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

// Reference to an instance method of a particular object

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Dragon Ball Z", 100), new Anime("Fullmetal Alchemist", 51), new Anime("Naruto", 85)));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
//        animeList.sort((a1, a2) -> animeComparators.compareByEpisodesNonStatic(a1, a2));
        System.out.println(animeList);
    }
}
