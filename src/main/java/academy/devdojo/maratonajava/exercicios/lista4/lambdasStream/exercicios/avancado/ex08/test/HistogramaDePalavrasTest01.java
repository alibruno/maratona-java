package academy.devdojo.maratonajava.exercicios.lista4.lambdasStream.exercicios.avancado.ex08.test;

//     Contexto: Análise de texto.
//
//    Tarefa: Dada uma frase longa (String), quebre-a em palavras (use split), gere um stream e agrupe as palavras
//    pelo seu tamanho (número de letras). O resultado deve ser um Map<Integer, List<String>>.

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HistogramaDePalavrasTest01 {
    public static void main(String[] args) {
        String texto = "Lorem ipsum dolor sit amet consectetur adipisicing elit.";
        Map<Integer, List<String>> collect = Arrays.stream(texto.split(" "))
                .collect(Collectors.groupingBy(String::length));
        System.out.println(collect);
    }
}
