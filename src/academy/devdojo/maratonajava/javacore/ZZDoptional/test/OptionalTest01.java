package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalTest01 {
    public static void main(String[] args) {
        // Objetivo: tentar evitar todos os tipos de NullPointerException e tratá-lo de forma funcional
        // Optional -> Encapsula uma classe
        // Não é indicado passar um Optional como parâmetro ou atributo de classe (Um dos problemas: não é serializável)

        Optional<String> o1 = Optional.of("Teste");
//        Optional<String> o2 = Optional.of(null); // NullPointerException

        // Javadoc -> Returns an Optional describing the given value, if non-null, otherwise returns an empty Optional.
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

        System.out.println("--------------------------------");

        Optional<String> nameOptional = findName("William");
        String empty = nameOptional.orElse("EMPTY"); // Javadoc -> If a value is present, returns the value, otherwise returns other.
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
        System.out.println(empty);
    }

    private static Optional<String> findName(String name){
        List<String> list = List.of("William", "DevDojo");
        int i = list.indexOf(name);
        if (i != -1){
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
