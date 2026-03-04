package academy.devdojo.maratonajava.javacore.ZZKjunit.service;

import academy.devdojo.maratonajava.javacore.ZZKjunit.dominio.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {
    private Person adult;
    private Person notAdult;

    @BeforeEach
    public void setUp() {
        adult = new Person(18);
        notAdult = new Person(15);
    }

    @Test
    @DisplayName("A person should be not adult when age is lower than 18")
    void isAdult_ReturnFalse_WhenAgeIsLowerThan18() {
        Assertions.assertFalse(PersonService.isAdult(notAdult));
    }

    @Test
    @DisplayName("A person should be adult when age is greater or equal than 18")
    void isAdult_ReturnTrue_WhenAgeIsGreaterOrEqualsThan18() {
        Assertions.assertTrue(PersonService.isAdult(adult));
    }

    @Test
    @DisplayName("Should throw NullPointerException with message when person is null")
    void isAdult_ThrowException_WhenPersonIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> PersonService.isAdult(null), "Person can't be null");
    }

    @Test
    @DisplayName("Should return list with only adults")
    void filterRemovingNotAdult_ReturnListWithAdultOnly_WhenListOfPersonWithAdultIsPassed() {
        Person person1 = new Person(17);
        Person person2 = new Person(18);
        Person person3 = new Person(21);
        List<Person> personList = List.of(person1, person2, person3);
        Assertions.assertEquals(2, PersonService.filterOnlyAdult(personList).size());
    }
}