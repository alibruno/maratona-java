package academy.devdojo.maratonajava.exercicios.lista4.lambdasStream.exercicios.intermediario.ex04;

import java.util.ArrayList;
import java.util.List;

//    Contexto: Transformação de dados (Map).
//
//    Tarefa: Dada uma lista de Strings ["a", "b", "c"], use um Stream para convertê-las em letras maiúsculas
//    e coletar o resultado. Use Method Reference (String::toUpperCase) obrigatoriamente.

public class ConversorStringTest01 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("a", "b", "c"));
        List<String> list = strings.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(list);
    }
}
