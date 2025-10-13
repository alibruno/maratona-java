package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
        printConsulta(gatos);
        List<Animal> animals = new ArrayList<>();
        printConsultaAnimal(animals);
    }

    //Type erasure
    //List<Animal> animals -> A lista de uma superclasse pode receber subclasses, mas como parâmetro isso não é possível. Em compilação, espera-se uma lista da superclasse.
    //List<? extends Animal> -> Contrato: não poderão ser adicionados subclasses no metodo.
    //List<? super Animal> animals -> Posso fazer adições, pois há garantia do polimorfismo. Cachorro e Gato extendem de Animal, este extende Object.

    private static void printConsulta(List<? extends Animal> animals){ // Pode receber: Ou animal Ou qualquer filho
        for (Animal animal : animals) {
            animal.consulta();
        }
//        animals.add(new Cachorro());
    }
    private static void printConsultaAnimal(List<? super Animal> animals){ // Pode receber: Ou Animal Ou qualquer pai
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
