package academy.devdojo.maratonajava.exercicios.lista4.lambdasStream.exercicios.basico.ex03.test;

import java.util.Arrays;
import java.util.List;

//     Contexto: Introdução ao pipeline filter.
//
//    Tarefa: Dada uma lista Arrays.asList(1, 2, 3, 4, 5, 6),
//    use Streams para criar uma nova lista contendo apenas os números pares.

public class FiltragemParesTest01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> listPares = list.stream()
                .filter(a -> a % 2 == 0)
                .toList();
        System.out.println(listPares);
    }
}
