package academy.devdojo.maratonajava.javacore.ZZKjunit.service;

import academy.devdojo.maratonajava.javacore.ZZKjunit.dominio.Person;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PersonService {
    public static boolean isAdult(Person person) {
        Objects.requireNonNull(person, "Person can't be null");
        return person.age() >= 18;
    }

    public static List<Person> filterOnlyAdult(List<Person> personList){
        return personList.stream().filter(PersonService::isAdult).collect(Collectors.toList());
    }
}
