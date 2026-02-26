package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {

        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Leo", "Michael");
        List<String> developers = List.of("Amanda", "Janaína");
        List<String> students = List.of("João", "Mel");
        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }

        }

        System.out.println("-----------------------------");

        //Flat map -> "retirar" atributos aninhados

        // Objetivo: Atuar sobre ** Stream<String> **

//        Stream<List<String>> stream = devdojo.stream();
//        Errado (map): Stream<Stream<String>> streamStream = devdojo.stream().map(Collection::stream);
//        Correto (flatMap): Stream<String> stringStream = devdojo.stream().flatMap(Collection::stream);

        devdojo.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);

        // ** OLHAR DOCUMENTAÇÃO: mapMulti() - Java 16 **
    }
}
