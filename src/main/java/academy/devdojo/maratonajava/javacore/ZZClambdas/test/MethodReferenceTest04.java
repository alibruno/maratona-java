package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

// Reference to a constructor

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        // Supplier -> Não recebe argumento e retorna T
//        Supplier<AnimeComparators> newAnimeComparators = () -> new AnimeComparators();
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Dragon Ball Z", 100), new Anime("Fullmetal Alchemist", 51), new Anime("Naruto", 85)));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

//        BiFunction<String, Integer, Anime> newAnime = (title, episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> newAnime = Anime::new; // coloca os dois atributos (String e Integer) no construtor e retorna Anime
        System.out.println(newAnime.apply("Super campeões", 36));


    }
}
