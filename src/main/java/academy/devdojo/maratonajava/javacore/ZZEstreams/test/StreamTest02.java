package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// "O que é uma Stream? (A Analogia da Esteira)
//
// Pense em uma Stream não como um lugar onde você guarda dados, mas como uma esteira de fábrica (pipeline) por onde os
// dados passam.
//
// O objetivo da Stream não é armazenar, é processar.
//
//    Fonte: Os dados entram na esteira (vindo de uma Lista, um Set, um Arquivo, etc.).
//
//    Operações Intermediárias: Os dados passam por máquinas que fazem algo com eles (filtram, transformam, ordenam).
//
//    Operação Terminal: O produto final sai da esteira e é entregue (coletado em uma nova lista, somado, impresso na
//    tela).
//
// Nota Importante: Uma Stream não "tem" dados. Ela apenas transporta dados de uma fonte através de um pipeline de
// operações."

public class StreamTest02 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(
            List.of(new LightNovel("test4", 3.50),
                    new LightNovel("test1", 4.90),
                    new LightNovel("test3", 15.20),
                    new LightNovel("test7", 2.99),
                    new LightNovel("test6", 6.00),
                    new LightNovel("test2", 1.99),
                    new LightNovel("test5", 3.99))
    );

    public static void main(String[] args) {
        // Streams -> operações -> Intermediárias (retorna o próprio stream -> encadear)/ Finais
        List<String> titles = lightNovelList.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(titles);
    }
}
