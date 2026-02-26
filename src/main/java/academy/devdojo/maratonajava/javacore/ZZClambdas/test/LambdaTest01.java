package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<Character> vogais = List.of('A', 'E', 'I', 'O', 'U');
        List<Integer> integers = List.of(0, 5, 10, 15);
        // Não é preciso especificar o tipo da variável da lambda (Ex: (Character v) -> ...)
        // pois a inferência do tipo acontece quando o metodo recebe a List<T>.
        forEach(vogais, v -> System.out.println(v));
        System.out.println("------------------------------");
        forEach(integers, i -> System.out.println(i));
    }

    // Consumer: interface funcional que recebe um tipo genérico e retorna void
    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
