package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> manga1 = MangaRepository.findByTitle("Yu Yu Hakusho");
        manga1.ifPresent(m -> m.setTitle("Yu Yu Hakusho 2"));
        System.out.println(manga1);

        Manga manga2 = MangaRepository.findById(1)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(manga2);

        Manga manga3 = MangaRepository.findByTitle("Kimetsu no Yaiba")
                .orElseGet(() -> new Manga(3, "Kimetsu no Yaiba", 68));
        System.out.println(manga3);
    }
}
