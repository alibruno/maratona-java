package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to a static method

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Dragon Ball Z", 100), new Anime("Fullmetal Alchemist", 51), new Anime("Naruto", 85)));

//        animeList.sort(new Comparator<Anime>() {
//            @Override
//            public int compare(Anime a1, Anime a2) {
//                return a1.getTitle().compareTo(a2.getTitle());
//            }
//        });

//        animeList.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));

        animeList.sort(AnimeComparators::compareByTitle); // simplifica a linha anterior
        System.out.println(animeList);

        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
