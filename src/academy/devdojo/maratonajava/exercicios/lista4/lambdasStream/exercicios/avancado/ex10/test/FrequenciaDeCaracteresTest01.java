package academy.devdojo.maratonajava.exercicios.lista4.lambdasStream.exercicios.avancado.ex10.test;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//    Contexto: Streams primitivos e mapas.
//
//    Tarefa: Dada uma string, conte a frequência de cada caractere. O resultado deve ser Map<Character, Long>.
//
//    Dica: Use str.chars() (retorna IntStream), converta para objeto (mapToObj) e
//    use Collectors.groupingBy(Function.identity(), Collectors.counting()).
public class FrequenciaDeCaracteresTest01 {
    public static void main(String[] args) {
        String texto = "Lorem ipsum dolor sit amet consectetur adipisicing elit.";
        // 1. Cria IntStream (97, 98, 114...)
        // 2. Converte int para Character (Objeto)
                // 3. Agrupa
                             // A chave é a própria letra
                            // O valor é a contagem de quantas vezes apareceu
        Map<Character, Long> collect = texto.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
